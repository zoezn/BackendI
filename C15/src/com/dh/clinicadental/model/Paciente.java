package com.dh.clinicadental.model;

import java.time.LocalDate;

public class Paciente {
    private Integer id;
    private String apellido;
    private String nombre;
    private Integer dni;
    private LocalDate fechaDeIngreso;
    private Domicilio domicilio;

    public Paciente(Integer id, String apellido, String nombre, Integer dni, LocalDate fechaDeIngreso, Domicilio domicilio) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeIngreso = fechaDeIngreso;
        this.domicilio = domicilio;
    }

    public Paciente(String apellido, String nombre, Integer dni, LocalDate fechaDeIngreso, Domicilio domicilio) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeIngreso = fechaDeIngreso;
        this.domicilio = domicilio;
    }

    public Integer getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public LocalDate getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", fechaDeIngreso=" + fechaDeIngreso +
                ", domicilio=" + domicilio +
                '}';
    }
}
