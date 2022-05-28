package com.company;

import java.util.HashMap;
import java.util.Map;

public class RopaFactory {
    private static Map<String, Ropa> ropa = new HashMap<>();
    private Integer contador = 0;

   /* //iterating over keys only
    for (String key : ropa.keySet()) {
        System.out.println("Key = " + key);
    }

    //iterando solo sobre valores
    for (String value : ropa.values()) {
        System.out.println("Value = " + value);
    }*/


    public Ropa getRopa(String talle, String tipo, Boolean esNuevo, Boolean importada) {
        String clave ="key:"+ talle + ":" + tipo + ":" + esNuevo + ":" + importada;

        if (!ropa.containsKey(clave)) {
            ropa.put(clave, new Ropa(talle, tipo, esNuevo, importada));
            System.out.println("Ropa creada");
            contador++;
            return ropa.get(clave);
        }
        System.out.println("Ropa obtenida");
        return ropa.get(clave);
    }


    public Integer getContador() {
        return contador;
    }
}
