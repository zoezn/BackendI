package com.company;

public class Presidente extends Gobierno{
    private Integer nivelDeAcceso = 3;

    public Presidente(String nombre) {
        super(nombre);
    }

    @Override
    public void leerDocumento(Documento documento) {
        if (documento.getTipo() <= nivelDeAcceso){
            System.out.println("Yo me encargo, soy Presidente.");
            System.out.println(documento.getContenido());
        } else if (getSigPuestoGobernante() != null){
            System.out.println("No puedo leer el documento, nadie puede");
        }
    }


}
