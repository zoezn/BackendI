package com.company;

public class ServiceDescargar implements IDescargar{


    @Override
    public void descargar(Usuario usuario) {
        System.out.println("La cancion esta siendo descargada");
    }
}
