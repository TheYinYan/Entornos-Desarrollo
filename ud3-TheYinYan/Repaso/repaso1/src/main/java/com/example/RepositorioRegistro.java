package com.example;

public interface RepositorioRegistro {
    boolean existe(String usuario);

    void guardar(String usuario);
}