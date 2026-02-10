package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

@ExtendWith(MockitoExtension.class)
public class ServicioLoginTest {

    @Mock
    RepositorioUsuarios repoMock;

    @InjectMocks
    ServicioLogin servicio;

    @Test
    void testLoginConsultaRepositorio() {

        when(repoMock.existeUsuario("samuel")).thenReturn(true);

        boolean resultado = servicio.login("samuel");
        assertTrue(resultado);
        verify(repoMock).existeUsuario("samuel");
    }

    @Test
    void testLoginUsuarioNoExiste() {

        when(repoMock.existeUsuario("samuel")).thenReturn(false);

        boolean resultado = servicio.login("samuel");
        assertEquals(false, resultado);
        verify(repoMock).existeUsuario("samuel");
    }
}