package com.dh.menu.main.service.impl;

import com.dh.menu.main.model.Menu;
import com.dh.menu.main.service.PrepararMenu;

public class PrepararMenuClasico extends PrepararMenu {

    @Override
    public double calcularPrecio(Menu menu) {
        return menu.getPrecioBase();
    }

    @Override
    public String armar() {
        return "Arma menu clasico!!!! ;))";
    }
}
