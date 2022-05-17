package com.dh.menu.main.service.impl;

import com.dh.menu.main.model.Menu;
import com.dh.menu.main.service.PrepararMenu;

public class PrepararMenuVegetariano extends PrepararMenu {
    private Double recargoPorSalsa = 2.0;
    private Double recargoPorEspecias = 0.1;



    @Override
    public double calcularPrecio(Menu menu) {
        if (menu.isTieneEspecias()){
            Double total = menu.getPrecioBase() + (menu.getCantidadSalsasVegetarianas() * recargoPorSalsa);
            total += total * 0.1;
            return total;
        }
        Double total = menu.getPrecioBase() + (menu.getCantidadSalsasVegetarianas() * recargoPorSalsa);
        return total;
    }

    @Override
    public String armar() {
        return "Menu vegetariano!!!! :)))";
    }
}
