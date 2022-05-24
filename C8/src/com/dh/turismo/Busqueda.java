package com.dh.turismo;

import java.time.LocalDate;

public class Busqueda {
    private ApiHotel apiHotel;
    private ApiVuelo apiVuelo;

    public Busqueda(ApiHotel apiHotel, ApiVuelo apiVuelo) {
        this.apiHotel = apiHotel;
        this.apiVuelo = apiVuelo;
    }


    public void realizarBusqueda(LocalDate fechaEntrada, LocalDate fechaSalida, String ciudad){
        apiHotel.buscarHoteles(fechaEntrada, fechaSalida, ciudad);
        System.out.println("__________________");
        apiVuelo.buscarVuelos(fechaEntrada, fechaSalida, ciudad);
    }


}
