package com.company;

import java.util.ArrayList;
import java.util.List;

public class Documento{


    private String id;
    private String url;
    private String contenido;
    private List<String> usuariosAutorizados;
    private List<String> historialAccesos;

    public Documento(String id, String url, String contenido) {
        this.id = id;
        this.url = url;
        this.contenido = contenido;
        usuariosAutorizados = new ArrayList<>();
        historialAccesos = new ArrayList<>();
    }

    public void agregarUsuariosAutorizados(String mail){
        usuariosAutorizados.add(mail);
    }
    public void agregarHistorialAccesos(String mail){
        historialAccesos.add(mail);
    }

    public String getUrl() {
        return url;
    }

    public String getContenido() {
        return contenido;
    }

    public List<String> getUsuariosAutorizados() {
        return usuariosAutorizados;
    }

    public List<String> getHistorialAccesos() {
        return historialAccesos;
    }
}
