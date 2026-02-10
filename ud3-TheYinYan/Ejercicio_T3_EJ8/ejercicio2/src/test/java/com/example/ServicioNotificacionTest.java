package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ServicioNotificacionTest {
    @Mock
    ProveedorNotificaciones repMock;

    @InjectMocks
    ServicioNotificacion server;

    @Test
    void enviarNotificacionTest() {

        String mensaje = "Hola Mundo";
        server.enviarNotificacion(mensaje);
        verify(repMock, times(1)).enviar(mensaje);
    }

}