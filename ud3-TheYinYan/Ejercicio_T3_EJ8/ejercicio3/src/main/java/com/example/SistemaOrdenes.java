package com.example;

public class SistemaOrdenes {
    private ProveedorDescuentos proveedorDescuentos;

    public SistemaOrdenes(ProveedorDescuentos proveedorDescuentos) {
        this.proveedorDescuentos = proveedorDescuentos;
    }

    double calcularTotal(double total) {
        return proveedorDescuentos.aplicarDescuento(total);
    }
}