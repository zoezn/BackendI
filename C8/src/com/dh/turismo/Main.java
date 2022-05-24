package com.dh.turismo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vuelo vuelo= new Vuelo(LocalDate.of(2020, 02, 20),LocalDate.of(2020, 02, 24), "Buenos Aires", "Madrid");
        Vuelo vuelo2= new Vuelo(LocalDate.of(2018, 02, 20),LocalDate.of(2020, 02, 24), "Madrid", "Madrid");
        Vuelo vuelo3= new Vuelo(LocalDate.of(2020, 02, 20),LocalDate.of(2020, 02, 24), "Londres", "Madrid");

        ApiVuelo apiVuelo = new ApiVuelo();
        apiVuelo.agregarVuelos(vuelo);
        apiVuelo.agregarVuelos(vuelo2);
        apiVuelo.agregarVuelos(vuelo3);


        Hotel hotel = new Hotel(LocalDate.of(2020, 02, 20), LocalDate.of(2020, 02, 24), "Madrid", "Hilton");
        Hotel hotel2 = new Hotel(LocalDate.of(2020, 02, 20), LocalDate.of(2020, 02, 24), "Madrid", "Sheraton");
        Hotel hotel3 = new Hotel(LocalDate.of(2010, 02, 20), LocalDate.of(2020, 02, 24), "Madrid", "Hilton");

        ApiHotel apiHotel = new ApiHotel();
        apiHotel.agregarHoteles(hotel);
        apiHotel.agregarHoteles(hotel2);
        apiHotel.agregarHoteles(hotel3);


        Busqueda busqueda = new Busqueda(apiHotel,apiVuelo);
        busqueda.realizarBusqueda(LocalDate.of(2020, 02, 20), LocalDate.of(2020, 02, 24), "Madrid" );

    }
}
