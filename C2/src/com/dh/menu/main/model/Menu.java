package com.dh.menu.main.model;

public class Menu {
    private double precioBase;
    private int cantidadSalsasVegetarianas;
    private int cantidadJuguetes;
    private boolean tieneEspecias;

    public Menu(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    public int getCantidadSalsasVegetarianas() {
        return this.cantidadSalsasVegetarianas;
    }

    public int getCantidadJuguetes() {
        return cantidadJuguetes;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setCantidadSalsasVegetarianas(int cantidadSalsasVegetarianas) {
        this.cantidadSalsasVegetarianas = cantidadSalsasVegetarianas;
    }

    public void setCantidadJuguetes(int cantidadJuguetes) {
        this.cantidadJuguetes = cantidadJuguetes;
    }

    public boolean isTieneEspecias() {
        return tieneEspecias;
    }

    public void setTieneEspecias(boolean tieneEspecias) {
        this.tieneEspecias = tieneEspecias;
    }
}
