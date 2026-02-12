package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RepositorioRegistroTest {
    private String usuario;

    @BeforeEach
    void setUp() {
        usuario = "Samuel";

    }

    @Mock
    RepositorioRegistro repMock;

    @InjectMocks
    ServicioRegistro servicioRegistro;

    @Test
    void registrarTest() {
        when(repMock.existe(usuario)).thenReturn(false);

        assertTrue(servicioRegistro.registrar(usuario));

        verify(repMock).guardar(usuario);
    }

    @Test
    void NoregistrarTest() {
        when(repMock.existe(usuario)).thenReturn(true);

        assertFalse(servicioRegistro.registrar(usuario));

        verify(repMock, never()).guardar(usuario);
    }

}