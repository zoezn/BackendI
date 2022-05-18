package com.company;

public class ControlLote extends AnalistaDeCalidad{

    @Override
    public void validadCalidadDelProducto(Articulo articulo) {
        if (articulo.getLote() >= 1000 && articulo.getLote() <= 2000){
            System.out.println("El lote es correcto, pasa al siguiente control");
            System.out.println("____________________________");
            getSigControl().validadCalidadDelProducto(articulo);

        } else if (getSigControl() != null){
            System.out.println("El lote es incorrecto, el articulo fue rechazado");
            System.out.println("____________________________");

        }
    }
}
