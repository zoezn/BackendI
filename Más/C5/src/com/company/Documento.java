package com.company;

import java.util.ArrayList;
import java.util.List;

public class Documento implements IVerDocumentos{
    private Integer id;
    private String url;
    private String contenido;
    private List<String> listaUsuariosAutorizados;
    private List<String> listaHistorialAccesos;

    public Documento(Integer id, String url, String contenido) {
        this.id = id;
        this.url = url;
        this.contenido = contenido;
        listaHistorialAccesos = new ArrayList<>();
        listaUsuariosAutorizados = new ArrayList<>();
    }


    /*   Pensemos en una aplicación al estilo Google Drive, un servicio que nos trae documentos.
                Para acceder al mismo, debemos enviarle una url y un email. Los documentos están
        compuestos por una id, una url, un contenido y una lista de usuarios autorizados a verlo.
                Queremos registrar quiénes acceden a los documentos. ¿Cómo resolverías este problema
        aplicando el patrón proxy?*/
}
