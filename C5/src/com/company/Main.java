package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Usuario usuario1= new Usuario(1, "Free");
        Usuario usuario2= new Usuario(2, "Premium");

        IDescargar proxyDescargar = new ProxyDescargar();

        proxyDescargar.descargar(usuario1);
        System.out.println("__________________________");
        proxyDescargar.descargar(usuario2);
        System.out.println("__________________________");



    }
}
