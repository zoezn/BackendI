package com.dh.menu.test;

import com.dh.menu.main.model.Menu;
import com.dh.menu.main.service.PrepararMenu;
import com.dh.menu.main.service.impl.PrepararMenuClasico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PrepararMenuClasicoTest {
    Menu menu = new Menu(250.0);
    PrepararMenuClasico prepararMenuClasico = new PrepararMenuClasico();

    @Test
    void calcularPrecio (){
        assertEquals(250.0, prepararMenuClasico.calcularPrecio(menu));
    }

    @Test
    void prepararPedido (){
        assertEquals(prepararMenuClasico.calcularPrecio(menu), prepararMenuClasico.prepararMenu(menu));
    }




}
