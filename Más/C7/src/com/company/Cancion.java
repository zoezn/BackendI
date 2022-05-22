package com.company;

public class Cancion {
    private String nombre;
    private String artista;
    private String genero;

    public Cancion(String nombre/*, String artista, String genero*/) {
        this.nombre = nombre;
        /*this.artista = artista;
        this.genero = genero;*/
    }


    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", artista='" + artista + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
