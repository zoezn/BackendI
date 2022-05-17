package com.company;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombre;
    private String apellido;
    private String email;
    private LocalDate edad;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate diaNacimiento) {
        this.edad = diaNacimiento;
    }

    public String mostrarNombre() {
        return apellido + ", " + nombre;
    }

    public boolean esMayor() {
        return Period.between(edad, LocalDate.of(2022,05,16)).getYears()>=18;
    }
}
