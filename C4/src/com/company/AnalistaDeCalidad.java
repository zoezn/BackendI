package com.company;

public abstract class AnalistaDeCalidad {
    private AnalistaDeCalidad sigControl;


    public AnalistaDeCalidad getSigControl() {
        return sigControl;
    }

    public void setSigControl(AnalistaDeCalidad sigControl) {
        this.sigControl = sigControl;
    }

    public abstract void validadCalidadDelProducto(Articulo articulo);
}
