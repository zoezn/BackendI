package com.dh.bosque;

import com.dh.bosque.dto.Arbol;
import com.dh.bosque.factory.ArboloFactory;

public class Bosque {

   /* static int CANVAS_SIZE = 500000;*/
    ArboloFactory factory = new ArboloFactory();
    private Integer contadorRojos = 0;
    private Integer contadorVerdes = 0;
    private Integer cantidadArboles = 0;


   /* public void sembrarArbolRojo(String tipo, String color){
        for (int i = 0; i < CANVAS_SIZE ; i++) {
            Arbol arbolRojo = factory.getArbol(tipo, color);
            contadorRojos++;

        }
        cantidadArboles += contadorRojos;
        System.out.println(contadorRojos);
    }

    public void sembrarArbolVerde(String tipo, String color){
        for (int i = 0; i < CANVAS_SIZE ; i++) {
            Arbol arbolVerde = factory.getArbol(tipo, color);
            contadorVerdes++;
        }
        cantidadArboles += contadorVerdes;
        System.out.println(contadorVerdes);
    }*/

    public void sembrar (String tipo, String color, Integer cantidadACrear){
        if (color =="Verde"){
            for (int i = 0; i < cantidadACrear ; i++) {
                Arbol arbolVerde = factory.getArbol(tipo, color);
                contadorVerdes++;
            }
            /*cantidadArboles += contadorVerdes;*/
            System.out.println("Se crearon " + contadorVerdes + " arboles de color " + color + " de tipo " + tipo);
        } else if (color == "Rojo"){
            for (int i = 0; i < cantidadACrear ; i++) {
                Arbol arbolRojo = factory.getArbol(tipo, color);
                contadorRojos++;
            }
            /*cantidadArboles += contadorRojos;*/
            System.out.println("Se crearon " + contadorRojos + " arboles de color " + color + " de tipo " + tipo);
        }
    }



    public static void main(String[] args) {
        Bosque bosque= new Bosque();

        bosque.sembrar("Frutal", "Rojo", 250000);
        System.out.println("_____________________");
        bosque.sembrar("Ornamental", "Rojo", 250000);
        System.out.println("_____________________");
        bosque.sembrar("Ornamental", "Verde", 250000);
        System.out.println("_____________________");
        bosque.sembrar("Frutal", "Verde", 250000);
        System.out.println("_____________________");
        System.out.println("Hay "+ bosque.contadorVerdes + "arboles verdes");
        System.out.println("_____________________");
        System.out.println("Hay "+ bosque.contadorRojos + "arboles rojos");
        System.out.println("_____________________");
        System.out.println("En el bosque hay " + (bosque.contadorRojos + bosque.contadorVerdes) + " arboles");
        System.out.println("_____________________");

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }


}
