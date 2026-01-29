package com.eed.tiempo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiempoTest {

    private Tiempo tiempo1;
    private Tiempo tiempo2;

    @BeforeEach
    void setUp() throws CantidadNegativaException {
        tiempo1 = new Tiempo(1, 60, 61);
        tiempo2 = new Tiempo(2, 50, 9);
    }

    @Test
    void testTiempo() {
        assertEquals(2, tiempo1.getHoras());
        assertEquals(1, tiempo1.getMinutos());
        assertEquals(1, tiempo1.getSegundos());
    }

    @Test
    void testTiempoNegativo() {
        Assertions.assertThrows(CantidadNegativaException.class, () -> {
            new Tiempo(-1, -2, -5);
        });
    }

    @Test
    void testSetters() {
        Assertions.assertThrows(CantidadNegativaException.class, () -> {
            tiempo1.setHoras(-1);
            tiempo1.setMinutos(-1);
            tiempo1.setSegundos(-1);
        });
    }

    @Test
    void testNormalizacionSegundos() throws CantidadNegativaException {
        Tiempo tiempo = new Tiempo(2, 4, 65);
        assertEquals(0,tiempo.getDias());
        assertEquals(2, tiempo.getHoras());
        assertEquals(5, tiempo.getMinutos());
        assertEquals(5, tiempo.getSegundos());
    }

    @Test
    void testNormalizacionMinutos() throws CantidadNegativaException {
        Tiempo tiempo = new Tiempo(2, 60, 0);
        assertEquals(0,tiempo.getDias());
        assertEquals(3, tiempo.getHoras());
        assertEquals(0, tiempo.getMinutos());
        assertEquals(0, tiempo.getSegundos());
    }

    @Test
    void testNormalizacionHoras() throws CantidadNegativaException {
        Tiempo tiempo = new Tiempo(24, 4, 6);
        assertEquals(1,tiempo.getDias());
        assertEquals(0, tiempo.getHoras());
        assertEquals(4, tiempo.getMinutos());
        assertEquals(6, tiempo.getSegundos());
    }

    @Test
    void testNormalizacionCombinada() throws CantidadNegativaException {
        Tiempo tiempo = new Tiempo(24, 60, 65);
        assertEquals(1,tiempo.getDias());
        assertEquals(1, tiempo.getHoras());
        assertEquals(1, tiempo.getMinutos());
        assertEquals(5, tiempo.getSegundos());
    }

    @Test
    void testSumaNotNull() throws CantidadNegativaException {
        Tiempo res = tiempo1.suma(tiempo2);
        assertNotNull(res);
    }

    @Test
    void testSumaNull() throws CantidadNegativaException {
        Assertions.assertThrows(NullPointerException.class, ()->{
            tiempo1.suma(null);
        });
    } 

    @Test
    void testSumaNormalizadaTiempos() throws CantidadNegativaException {
        Tiempo res = tiempo1.suma(tiempo2);
        assertEquals(4, res.getHoras());
        assertEquals(51, res.getMinutos());
        assertEquals(10, res.getSegundos());
    }

    @Test
    void testSumaNormalizadaEnteros() throws CantidadNegativaException {
        tiempo1.suma(2, 50, 59);
        assertEquals(4, tiempo1.getHoras());
        assertEquals(52, tiempo1.getMinutos());
        assertEquals(0, tiempo1.getSegundos());
    }
}
