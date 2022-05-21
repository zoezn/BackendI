package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Usuario usuario1= new Usuario("asd@gmail.com");
        usuario1.setUrl("asd.com");

        Usuario usuario2= new Usuario("123@gmail.com");
        usuario2.setUrl("asd.com");
        
        Documento documento1 = new Documento("1", "asd.com", "blaaa bla bla bla ijijijij");
        documento1.agregarUsuariosAutorizados("asd@gmail.com");
        documento1.agregarUsuariosAutorizados("123@gmail.com");

        ProxyDocumento proxy = new ProxyDocumento();

        proxy.leerDocumento(documento1,usuario1);
        proxy.leerDocumento(documento1,usuario2);


        System.out.println(documento1.getHistorialAccesos());
    }
}
