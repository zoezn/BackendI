package com.dh.menu.main.service;

import com.dh.menu.main.model.Menu;

public abstract class PrepararMenu {

    public double prepararMenu(Menu menu)
    {
        System.out.println(armar());
        return calcularPrecio(menu);
    }
    public abstract double calcularPrecio(Menu menu);
    public abstract String armar();
}
