package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Documento documento1= new Documento(1,"asd.com", "akhdsjahsdjkasd");
        Usuario usuario1 = new Usuario("asd@gmail.com", "asd.com");

        documento1.agregarUsuariosAutorizados(usuario1);

        documento1.conectarConDocumento(usuario1);

        Usuario usuario2= new Usuario("jaja@gmail.com", ":)");

        System.out.println(documento1.getListaHistorialAccesos());

    }
}
