package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class InventarioTest {
    @Mock
    RepositorioInventario repoInventario;

    @InjectMocks
    Inventario inventario;

    @Test
    void contineProductoTest() {
        when(repoInventario.contiene("Teclado")).thenReturn(true);
        boolean resultado = inventario.contineProducto("Teclado");
        assertTrue(resultado);
    }

    @Test
    void eliminarProductoTest() {
        when(repoInventario.contiene("Teclado")).thenReturn(false);

        inventario.eliminarProducto("Teclado");
        verify(repoInventario).eliminar("Teclado");

        assertFalse(inventario.contineProducto("Teclado"));
    }
}