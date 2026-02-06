package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ServicioLoginTest {

    @Test
    void testLoginConsultaRepositorio() {

        RepositorioUsuarios repoMock = mock(RepositorioUsuarios.class);

        when(repoMock.existeUsuario("samuel")).thenReturn(true);

        ServicioLogin servicio = new ServicioLogin(repoMock);

        boolean resultado = servicio.login("samuel");

        assertTrue(resultado);

        verify(repoMock).existeUsuario("samuel");
    }
}