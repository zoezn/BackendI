package com.company;

public class Serie implements ISerie{


    @Override
    public String getPelicula(String nombre) throws SerieNoHabilitadaException{
        return "www." + nombre;
    }
}
