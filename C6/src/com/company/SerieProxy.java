package com.company;

public class SerieProxy implements ISerie {
    private Integer cantVistas;
    private Serie serie;

    public SerieProxy() {
        serie = new Serie();
    }

    public void setCantVistas(Integer cantVistas) {
        this.cantVistas = cantVistas;
    }

    @Override
    public String getPelicula(String nombre) throws SerieNoHabilitadaException {
        if (cantVistas <= 5){
            serie.getPelicula(nombre);
            cantVistas++;
            return "Puede ver la pelicula " + nombre + ".";
        } else{
            throw new SerieNoHabilitadaException("Ha superado la cantidad de reproducciones permitidas");
        }

    }

   /* @Override
    public String getPelicula(String nombre) throws SerieNoHabilitadaException {
        try {
            if (cantVistas <= 5){
                serie.getPelicula(nombre);
                cantVistas++;
                return "Puede ver la pelicula " + nombre + ".";
        } } catch (){
                return "La pelicula " + nombre + " ya fue vista " + cantVistas + " veces.";
            }
    }
*/


}
