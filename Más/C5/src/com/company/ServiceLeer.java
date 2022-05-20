package com.company;

public class ServiceLeer implements LeerDocumento{


    @Override
    public void leerDocumento(Documento documento) {
        System.out.println("El contenido del documento es: ");
        System.out.println(documento.getContenido());
        System.out.println("________________________________");
    }
}
