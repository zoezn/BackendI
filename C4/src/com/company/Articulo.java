package com.company;

public class Articulo {
    private String nombre;
    private Integer peso;
    private Integer lote;
    private String envasado;

    public Articulo(String nombre, Integer peso, Integer lote, String envasado) {
        this.nombre = nombre;
        this.peso = peso;
        this.lote = lote;
        this.envasado = envasado;
    }

    public Integer getPeso() {
        return peso;
    }

    public Integer getLote() {
        return lote;
    }

    public String getEnvasado() {
        return envasado;
    }
}
