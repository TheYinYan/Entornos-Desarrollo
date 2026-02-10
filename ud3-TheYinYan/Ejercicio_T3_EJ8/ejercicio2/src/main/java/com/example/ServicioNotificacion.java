package com.example;

public class ServicioNotificacion {
    private ProveedorNotificaciones proveedor;

    public ServicioNotificacion(ProveedorNotificaciones proveedor) {
        this.proveedor = proveedor;
    }

    public void enviarNotificacion(String mensaje) {
        proveedor.enviar(mensaje);
    }
}