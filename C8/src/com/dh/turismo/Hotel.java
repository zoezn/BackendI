package com.dh.turismo;

import java.time.LocalDate;

public class Hotel {
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private String ciudad;
    private String nombre;


    public Hotel(LocalDate fechaEntrada, LocalDate fechaSalida, String ciudad, String nombre) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.ciudad = ciudad;
        this.nombre= nombre;
    }


    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public String getCiudad() {
        return ciudad;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "nombre=" + nombre +
                "fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
