package com.dh.bosque.dto;

public class Arbol {
    private Integer alto;
    private Integer ancho;
    private String color;
    private String tipo;

    public Arbol(String color, String tipo) {
        this.color = color;
        this.tipo = tipo;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
