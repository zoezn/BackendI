package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        CompruebaCalidad compruebaCalidad = new CompruebaCalidad();

        System.out.println("Comprobando vaso");
        Articulo vaso = new Articulo("Vaso", 1300, 1500, "Sano");
        compruebaCalidad.comprobar(vaso);

        System.out.println("Comprobando mesa");
        Articulo mesa = new Articulo("Mesa", 1200, 900, "Casi sano");
        compruebaCalidad.comprobar(mesa);


        System.out.println("Comprobando sillon");
        Articulo sillon = new Articulo("Sillon", 100, 1500, "Sano");
        compruebaCalidad.comprobar(sillon);


        System.out.println("Comprobando armario");
        Articulo armario = new Articulo("Armario" , 1200, 1500, "Malo");
        compruebaCalidad.comprobar(armario);
    }
}
