package com.company;

public class Programa {
    private String tipoFigura;
    private Double radio;
    private Double lados;

    public Programa(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getLados() {
        return lados;
    }

    public void setLados(Double lados) {
        this.lados = lados;
    }

    public String calcularArea(){
        if (tipoFigura == "Circulo" && getLados() < 0){
            return ("El valor del radio o lado debe ser mayor que cero");
        } else if (tipoFigura == "Cuadrado" && getRadio() < 0 ){
            return ("El valor del radio o lado debe ser mayor que cero");
        } else if (tipoFigura == "Circulo" ){
            Double area = Math.PI * radio * radio;
            return ( "El área del " + tipoFigura + " es " + area + " unidades.");
        } else if (tipoFigura == "Cuadrado"){
            Double area = lados * 2;
            return ("El área del " + tipoFigura + " es " + area + " unidades.");
        }

        return "Error";
    }


}
