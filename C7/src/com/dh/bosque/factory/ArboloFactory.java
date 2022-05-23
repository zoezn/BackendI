package com.dh.bosque.factory;

import com.dh.bosque.dto.Arbol;

import java.util.HashMap;
import java.util.Map;

public class ArboloFactory {

    private static Map<String, Arbol> arboles = new HashMap<>();

    public Arbol getArbol(String tipo, String color) {

        String clave ="key:"+ tipo + ":" + color;

       /* System.out.println(clave);*/

        if (!arboles.containsKey(clave)) {
            arboles.put(clave, new Arbol(tipo, color));
           /* System.out.println("Arbol creado");*/
            return arboles.get(clave);
        }
      /*  System.out.println("Arbol obtenido");*/

        return arboles.get(clave);
    }










}
