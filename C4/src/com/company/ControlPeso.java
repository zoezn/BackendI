package com.company;

public class ControlPeso extends AnalistaDeCalidad{
    @Override
    public void validadCalidadDelProducto(Articulo articulo) {
        if (articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300){
            System.out.println("El peso es correcto, pasa al siguiente control");
            System.out.println("____________________________");
            getSigControl().validadCalidadDelProducto(articulo);

        } else if (getSigControl() != null){
            System.out.println("El peso es incorrecto, el articulo fue rechazado");
            System.out.println("____________________________");

        }
    }
}
