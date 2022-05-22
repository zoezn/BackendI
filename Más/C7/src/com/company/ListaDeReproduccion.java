package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListaDeReproduccion {
    private String nombre;
    private List<Cancion> canciones;

    public ListaDeReproduccion(String nombre) {
        this.nombre = nombre;
        canciones = new ArrayList<>();
    }

    public void agregarCanciones(Cancion cancion){
        canciones.add(cancion);
        System.out.println(canciones);
    }

    public void eliminarCanciones(Cancion cancion){
        canciones.remove(cancion);
        if (canciones.isEmpty()){
            System.out.println("La playlist esta vacia");
        } else {
            System.out.println(canciones);
        }
    }

}
