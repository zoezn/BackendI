package com.dh.menu.main.service.impl;

import com.dh.menu.main.model.Menu;
import com.dh.menu.main.service.PrepararMenu;

public class PrepararMenuInfantil extends PrepararMenu {
    private Double recargoPorJuguete = 3.0;

    @Override
    public double calcularPrecio(Menu menu) {
        Double total = menu.getPrecioBase() + menu.getCantidadJuguetes() * recargoPorJuguete;
        return total;
    }

    @Override
    public String armar() {
        return "Blabla menu infantil!!!";
    }
}
