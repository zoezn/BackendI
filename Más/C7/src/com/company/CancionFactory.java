package com.company;

import java.util.HashMap;
import java.util.Objects;

public class CancionFactory {
    private static CancionFactory instance;
    private static final HashMap<String, Cancion> CANCION_MAP = new HashMap<>();

    private CancionFactory(){};

    public static CancionFactory getInstance() {
        if (instance == null){
            instance = new CancionFactory();
        }
        return instance;
    };

    public Cancion getCancion(String nombre) {
        Cancion cancion = CANCION_MAP.get(nombre);
        if (Objects.isNull(cancion)) {
            cancion = new Cancion(nombre);
            CANCION_MAP.put(nombre, cancion);
            System.out.println("Creando Objecto de cancion: " + nombre);
            return cancion;

        }
        System.out.println("Recuperando Objecto de cancion: " + cancion);
        return cancion;
    }

}
