package com.company;

public abstract class Gobierno {
    private String nombre;
    private Gobierno sigPuestoGobernante;

    public Gobierno(String nombre) {
        this.nombre = nombre;
    }

    public abstract void leerDocumento(Documento documento);

    public Gobierno getSigPuestoGobernante() {
        return sigPuestoGobernante;
    }

    public void setSigPuestoGobernante(Gobierno sigPuestoGobernante) {
        this.sigPuestoGobernante = sigPuestoGobernante;
    }
}
