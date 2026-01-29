package com.eed.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    // Test suma

    @Test
    void sumaPositivoTest() {
        Calculadora cal = new Calculadora();
        int resu = cal.sumar(5, 10);
        assertEquals(15, resu, "La suma 5 + 10 debe dar 15");
    }

    @Test
    void sumaNegativoTest() {
        Calculadora cal = new Calculadora();
        int resu = cal.sumar(5, -1);
        assertEquals(4, resu, "La suma 5 + -1 debe dar 4");
    }

    // Test Resta

    @Test
    void restaPositivoTest() {
        Calculadora cal = new Calculadora();
        int resu = cal.restar(5, 2);
        assertEquals(3, resu, "La resta 5 - 2 debe dar 3");
    }

    @Test
    void restaNegativoTest() {
        Calculadora cal = new Calculadora();
        int resu = cal.restar(5, -2);
        assertEquals(7, resu, "La resta 5 - -2 debe dar 7");
    }

    // Test Multiplicacion

    @Test
    void multiplicarPositivoTest() {
        Calculadora cal = new Calculadora();
        int resu = cal.multiplicar(5, 2);
        assertEquals(10, resu, "La multiplicar 5 * 2 debe dar 10");
    }

    @Test
    void multiplicarNegativoTest() {
        Calculadora cal = new Calculadora();
        int resu = cal.multiplicar(5, -2);
        assertEquals(-10, resu, "La multiplicar 5 * 2 debe dar -10");
    }

    @Test
    void multiplicarPor0Test() {
        Calculadora cal = new Calculadora();
        int resu = cal.multiplicar(5, 0);
        assertEquals(0, resu, "La multiplicar 5 * 0 debe dar 0");
    }

    // Test Division

    @Test
    void dividirPositivoTest() {
        Calculadora cal = new Calculadora();
        int resu = cal.dividir(10, 2);
        assertEquals(5, resu, "La division 10 / 2 debe dar 5");
    }

    @Test
    void dividirNegativoTest() {
        Calculadora cal = new Calculadora();
        int resu = cal.dividir(10, -2);
        assertEquals(-5, resu, "La division 10 / 2 debe dar -5");
    }

    @Test 
    void dividirPor0Test(){
        Calculadora cal = new Calculadora();
        int resu = cal.dividir(0, 10);
        assertEquals(0, resu,"La division 0 / 10 debe dar 0");
    }

}
