package com.example;

public class ServicioRegistro {

    private RepositorioRegistro repo;

    public ServicioRegistro(RepositorioRegistro repo) {
        this.repo = repo;
    }

    public boolean registrar(String usuario) {

        if(repo.existe(usuario)) {
            return false;
        }

        repo.guardar(usuario);
        return true;
    }
}