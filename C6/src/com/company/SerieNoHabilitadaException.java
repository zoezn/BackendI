package com.company;

public class SerieNoHabilitadaException extends Exception{

    public SerieNoHabilitadaException() {
    }

    public SerieNoHabilitadaException(String message) {
        super(message);
    }

    @Override
    public String toString(){
        return "Se produjo la siguiente excepcion: "+getMessage();
    }
}
