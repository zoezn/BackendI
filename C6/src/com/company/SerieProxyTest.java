package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SerieProxyTest {
    SerieProxy proxy = new SerieProxy();
    SerieProxy proxy2 = new SerieProxy();

    @BeforeEach
    void doBefore(){
        proxy.setCantVistas(4);
        proxy2.setCantVistas(6);
    }

    @Test
    void test() throws SerieNoHabilitadaException {
        assertEquals(proxy.getPelicula("Barbie"), "Puede ver la pelicula Barbie.");
    }

   /* @Test
    void test2() throws SerieNoHabilitadaException{
        *//*try {
            proxy2.getPelicula("El rey leon");
        } catch (SerieNoHabilitadaException e) {
            e.printStackTrace();
            assertEquals(proxy2.getPelicula("El rey leon"), SerieNoHabilitadaException);
        }*//*

        assertEquals(proxy2.getPelicula("El rey leon"),"Se produjo la siguiente excepcion: Ha superado la cantidad de reproducciones permitidas");
    }*/

}
