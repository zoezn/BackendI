package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Gobierno ministro = new Ministro("Damian");
        Gobierno diputado = new Diputado("Matias");
        Gobierno presidente = new Presidente("Marta");

        Documento documento1= new Documento("u baby baby baby uuuuu", 3);
        Documento documento2= new Documento("annie are u okay are u okay annie", 2);
        Documento documento3= new Documento("un año sin ver lloveeeeeeeer", 1);

        diputado.setSigPuestoGobernante(ministro);
        ministro.setSigPuestoGobernante(presidente);

        diputado.leerDocumento(documento1);
        System.out.println("_______________________________________________");
        diputado.leerDocumento(documento2);
        System.out.println("_______________________________________________");
        diputado.leerDocumento(documento3);
        System.out.println("_______________________________________________");

    }
}
