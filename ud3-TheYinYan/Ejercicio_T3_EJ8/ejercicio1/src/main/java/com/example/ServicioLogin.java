package com.example;

public class ServicioLogin {

    private RepositorioUsuarios repositorio;

    public ServicioLogin(RepositorioUsuarios repositorio) {
        this.repositorio = repositorio;
    }

    public boolean login(String usuario) {
        return repositorio.existeUsuario(usuario);
    }
}