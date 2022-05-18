package com.company;

public class ControlEnvasado extends AnalistaDeCalidad{
    public void validadCalidadDelProducto(Articulo articulo) {
        if (articulo.getEnvasado().equals("Sano") || articulo.getEnvasado().equals("Casi sano")){
            System.out.println("El envasado es correcto, el articulo fue aceptado");
            System.out.println("____________________________");
        } else if (getSigControl() == null){
            System.out.println("El envasado es incorrecto, el articulo fue rechazado");
            System.out.println("____________________________");
        }
    }
}
