package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SistemaOrdenesTest {
    @Mock
    ProveedorDescuentos repMock;

    @InjectMocks
    SistemaOrdenes sistemaOrdenes;

    @Test
    void calcularTotalTest() {
        when(repMock.aplicarDescuento(100.00)).thenReturn(80.0);
        assertEquals(80.00, sistemaOrdenes.calcularTotal(100));
        verify(repMock).aplicarDescuento(100.00);
    }
}