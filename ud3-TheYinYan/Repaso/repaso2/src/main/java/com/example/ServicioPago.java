package com.example;

public class ServicioPago {
    private ProveedorPago proveedor;

    public ServicioPago(ProveedorPago proveedor) {
        this.proveedor = proveedor;
    }

    public boolean procesarPago(double cantidad) {
        return proveedor.cobrar(cantidad);
    }
}
