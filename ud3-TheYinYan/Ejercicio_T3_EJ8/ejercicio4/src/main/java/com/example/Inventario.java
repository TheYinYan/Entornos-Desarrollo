package com.example;

public class Inventario {
    private RepositorioInventario repoInventario;

    public void eliminarProducto(String producto){
        repoInventario.eliminar(producto);
    } 

    public boolean contineProducto(String producto){
        return repoInventario.contiene(producto);
    } 
}