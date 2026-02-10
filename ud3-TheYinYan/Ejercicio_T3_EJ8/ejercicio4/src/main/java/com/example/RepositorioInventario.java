package com.example;

public interface RepositorioInventario {
    void eliminar(String producto);
    boolean contiene(String producto);
}