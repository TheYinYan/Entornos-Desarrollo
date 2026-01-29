package com.eed.cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaTest {

    // Preparacion del Test

    private Cuenta cuenta100;
    private Cuenta cuenta200;

    @BeforeEach
    void setUp() throws CantidadNegativaException {
        cuenta100 = new Cuenta(100);
        cuenta200 = new Cuenta(200);
    }

    // Test Salario

    @Test
    void testsaldoIni() {
        assertEquals(100, cuenta100.getSaldo());
        assertEquals(200, cuenta200.getSaldo());
    }

    // No se admiten cuentas con saldo negativo
    @Test
    void testSaldoIniNoADNegativo() {
        Assertions.assertThrows(CantidadNegativaException.class, () -> {
            new Cuenta(-50);
        });
    }

    // Test ingreso

    @Test
    void testIngreso() throws Exception {
        cuenta100.ingreso(50);
        cuenta200.ingreso(50);
        assertEquals(150, cuenta100.getSaldo());
        assertEquals(250, cuenta200.getSaldo());
    }

    // No puede realizarse un ingreso de una cantidad negativa
    @Test
    void testIngresoNegativo() {
        assertThrows(CantidadNegativaException.class, () -> {
            cuenta100.ingreso(-50);
        });
    }

    // Test Reintegro

    @Test
    void testReingreso() throws ReintegroException {
        cuenta100.reintegro(100);
        cuenta200.reintegro(100);
        assertEquals(0, cuenta100.getSaldo());
        assertEquals(100, cuenta200.getSaldo());
    }

    // No puede realizarse un reintegro de una cantidad negativa
    @Test
    void testReintegroNegativo() {
        Assertions.assertThrows(CantidadNegativaException.class, () -> {
            cuenta100.reintegro(-100);
            cuenta200.reintegro(-100);
        });
    }

    // No puede realizarse un reintegro Mayor al saldo
    @Test
    void testReintegroMayorASaldo() {
        Assertions.assertThrows(ReintegroException.class, () -> {
            cuenta100.reintegro(150);
            cuenta200.reintegro(250);
        });
    }

    // Test Transferencia

    @Test
    void testTransferencia() throws TransferenciaException {
        cuenta200.transferencia(50, cuenta100);
        assertEquals(150, cuenta100.getSaldo());
        assertEquals(150, cuenta200.getSaldo());
    }


    // Para realizar una transferencia debe haber dinero suficiente en la cuenta origen
    @Test
    void testTransferenciaMayorSaldo() {
        Assertions.assertThrows(TransferenciaException.class, () -> {
            cuenta100.transferencia(150, cuenta200);
            cuenta200.transferencia(250, cuenta100);
        });
    }

    // No se puede hacer transferencias negativas
    @Test 
    void testTransferenciaNegativa(){
        Assertions.assertThrows(CantidadNegativaException.class, ()->{
            cuenta100.transferencia(-10, cuenta200);
            cuenta200.transferencia(-10, cuenta100);
        });
    }

}
