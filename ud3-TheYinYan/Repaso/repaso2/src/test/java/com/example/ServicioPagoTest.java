package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ServicioPagoTest {
    private double cantidad;
    private double cantidadAlta;

    @BeforeEach
    void setUp(){
        cantidad = 100;
        cantidadAlta = 1000;
    }

    @Mock
    ProveedorPago repoMock;

    @InjectMocks
    ServicioPago servicioPago;

    @Test
    void procesarPagoExitoso(){
        when(repoMock.cobrar(cantidad)).thenReturn(true);

        assertTrue(servicioPago.procesarPago(cantidad));

        verify(repoMock).cobrar(cantidad);
    }

    @Test
    void procesarPagoFallido(){
        when(repoMock.cobrar(cantidadAlta)).thenReturn(false);

        assertFalse(servicioPago.procesarPago(cantidadAlta));

        verify(repoMock).cobrar(cantidadAlta);
    }

}