package com.company;

public class Usuario {
      /* Pensemos en una aplicación al estilo Google Drive, un servicio que nos trae documentos.
    Para acceder al mismo, debemos enviarle una url y un email. Los documentos están compuestos
    por una id, una url, un contenido y una lista de usuarios autorizados a verlo. Queremos registrar
    quiénes acceden a los documentos. ¿Cómo resolverías este problema aplicando el patrón proxy?*/

    private String mail;
    private String url;

    public Usuario(String mail) {
        this.mail = mail;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMail() {
        return mail;
    }



}
