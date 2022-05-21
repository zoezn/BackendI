package com.dh.vendedores;

public abstract class Vendedor {
    protected String nombre;
    protected Integer puntosAlcanzados;

    public Vendedor(String nombre, Integer puntosAlcanzados) {
        this.nombre = nombre;
        this.puntosAlcanzados = puntosAlcanzados;
    }

    public abstract void vender();
    public abstract void calcularPuntos();
    public String mostrarCategoria(){
        if (puntosAlcanzados < 20){
            return "Novato";
        } else if (puntosAlcanzados >= 20 && puntosAlcanzados <= 30){
            return "Aprendiz";
        } else if (puntosAlcanzados > 30 && puntosAlcanzados <= 40){
            return "Bueno";
        } else if (puntosAlcanzados > 40){
            return "Maestro";
        }
        return "Error";
    }


}
