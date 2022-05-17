package com.dh.menu.test;

import com.dh.menu.main.model.Menu;
import com.dh.menu.main.service.PrepararMenu;
import com.dh.menu.main.service.impl.PrepararMenuInfantil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrepararMenuInfantilTest {
    Menu menu = new Menu(300.0);
    PrepararMenuInfantil prepararMenuInfantil = new PrepararMenuInfantil();

    @BeforeEach
    void setJuguetes(){
        menu.setCantidadJuguetes(5);
    }

    @Test
    void calcularPrecio(){
        assertEquals(prepararMenuInfantil.calcularPrecio(menu), 315.0 );
    }

    @Test
    void prepararPedido(){
        assertEquals(prepararMenuInfantil.calcularPrecio(menu), 315.0 );
    }






}
