package com.example;

public class ServicioCorreo {

    private ProveedorCorreo proveedor;

    public ServicioCorreo(ProveedorCorreo proveedor) {
        this.proveedor = proveedor;
    }

    public void enviar(String destino) {
        proveedor.enviarCorreo(destino);
    }
}