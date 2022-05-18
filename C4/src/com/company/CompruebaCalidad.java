package com.company;

public class CompruebaCalidad {
    AnalistaDeCalidad analista;

    public CompruebaCalidad() {
        this.analista = new ControlLote();
        AnalistaDeCalidad peso = new ControlPeso();
        AnalistaDeCalidad envasado = new ControlEnvasado();

        analista.setSigControl( peso );
        peso.setSigControl(envasado);
    }

    public void comprobar(Articulo  articulo)
    {
        analista.validadCalidadDelProducto( articulo );
    }
}
