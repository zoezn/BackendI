package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CancionFactory factory = CancionFactory.getInstance();

        Cancion cancion= factory.getCancion("Heartless");
        cancion.setArtista("Kanye West");
        cancion.setGenero("Kanye :p");
        System.out.println("_______________________________________");
        factory.getCancion("Heartless");
        System.out.println("_______________________________________");

        Cancion cancion2= factory.getCancion("Bound 2");
        System.out.println("_______________________________________");

        ListaDeReproduccion lista = new ListaDeReproduccion("Hola");

        lista.agregarCanciones(cancion);
        System.out.println("_______________________________________");
        lista.agregarCanciones(cancion2);
        System.out.println("_______________________________________");
        lista.eliminarCanciones(cancion);
        System.out.println("_______________________________________");
    }
}
