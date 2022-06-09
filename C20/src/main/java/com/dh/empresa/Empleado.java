package com.dh.empresa;

import java.io.Serializable;

public class Empleado implements Serializable {
    private String nombre;
    private String apellido;
    private Integer legajo;
    private Integer sueldo;

    public Empleado(String nombre, String apellido, Integer legajo, Integer sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return  nombre +
                ";" + apellido +
                ";" + legajo +
                ";" + sueldo ;
    }
}
