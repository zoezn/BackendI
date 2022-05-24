package com.dh.turismo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ApiVuelo {

    private List<Vuelo> apiVuelos = new ArrayList<>();

    public void agregarVuelos (Vuelo vuelo){
        apiVuelos.add(vuelo);
    }


    public void buscarVuelos(LocalDate fechaEntrada, LocalDate fechaSalida, String ciudad){
        for (Vuelo vueloLista : apiVuelos) {
            if (vueloLista.getDestino().equals(ciudad) && vueloLista.getFechaSalida().equals(fechaEntrada) && vueloLista.getFechaRegreso().equals(fechaSalida)){
                System.out.println(vueloLista);
                System.out.println("__________________");
            } else {
                System.out.println("No hay vuelos disponibles");
                System.out.println("__________________");
            }
        }


} }
