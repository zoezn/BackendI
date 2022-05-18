package com.company;

public class Diputado extends Gobierno{
    private Integer nivelDeAcceso = 1;

    public Diputado(String nombre) {
        super(nombre);
    }

    @Override
    public void leerDocumento(Documento documento) {
        if (documento.getTipo() == nivelDeAcceso){
            System.out.println("Yo me encargo, soy Diputado.");
            System.out.println(documento.getContenido());
            getSigPuestoGobernante().leerDocumento(documento);
        } else if (getSigPuestoGobernante() != null){
            System.out.println("No puedo leer el documento, lo paso al siguiente jerarca");
            getSigPuestoGobernante().leerDocumento(documento);
        }
    }
}
