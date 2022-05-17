package com.dh.menu.test;

import com.dh.menu.main.model.Menu;
import com.dh.menu.main.service.PrepararMenu;
import com.dh.menu.main.service.impl.PrepararMenuVegetariano;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrepararMenuVegetarianoTest {
    Menu menu = new Menu(150.0);
    Menu menu2 = new Menu(150.0);
    Menu menu3 = new Menu(150.0);
    PrepararMenuVegetariano prepararMenuVegetariano = new PrepararMenuVegetariano();

    @BeforeEach
    void settear(){
        menu.setTieneEspecias(true);
        menu.setCantidadSalsasVegetarianas(2);

        menu2.setTieneEspecias(true);
        menu2.setCantidadSalsasVegetarianas(0);

        menu3.setTieneEspecias(false);
        menu3.setCantidadSalsasVegetarianas(10);
    }

    @Test
    void calcularPrecio(){
        assertEquals(169.4, prepararMenuVegetariano.calcularPrecio(menu));

        assertEquals(165.0, prepararMenuVegetariano.calcularPrecio(menu2));

        assertEquals(170.0, prepararMenuVegetariano.calcularPrecio(menu3));
    }


    @Test
    void prepararMenu(){
        assertEquals(169.4, prepararMenuVegetariano.calcularPrecio(menu));

        assertEquals(165.0, prepararMenuVegetariano.calcularPrecio(menu2));

        assertEquals(170.0, prepararMenuVegetariano.calcularPrecio(menu3));
    }

}
