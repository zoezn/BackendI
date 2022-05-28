package com.dh.turismo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ApiHotel {

    private List<Hotel> apiHoteles = new ArrayList<>();

    public void agregarHoteles (Hotel hotel) {
        apiHoteles.add(hotel);
    }

    public void buscarHoteles(LocalDate fechaEntrada, LocalDate fechaSalida, String ciudad){
        boolean variable = false;
        for (Hotel hotelLista : apiHoteles) {
            if (hotelLista.getCiudad().equals(ciudad) && hotelLista.getFechaSalida().equals(fechaSalida) && hotelLista.getFechaEntrada().equals(fechaEntrada)){
                System.out.println(hotelLista);
                System.out.println("__________________");
                variable = true;
            }

        }
        if (!variable){
            System.out.println("No hay hoteles disponibles");
            System.out.println("__________________");
        }

    }


}
