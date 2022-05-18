package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Ministro extends Gobierno{
    private Integer nivelDeAcceso = 2;



    public Ministro(String nombre) {
        super(nombre);
    }

    @Override
    public void leerDocumento(Documento documento) {
        if (documento.getTipo() <= nivelDeAcceso){
            System.out.println("Yo me encargo, soy Ministro.");
            System.out.println(documento.getContenido());
            getSigPuestoGobernante().leerDocumento(documento);
        } else if (getSigPuestoGobernante() != null){
            System.out.println("No puedo leer el documento, lo paso al siguiente jerarca");
            getSigPuestoGobernante().leerDocumento(documento);
        }
    }


}
