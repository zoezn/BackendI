package com.company;

import java.util.ArrayList;
import java.util.List;

public class Documento implements IVerDocumentos{
    private Integer id;
    private String url;
    private String contenido;
    private List<Usuario> listaUsuariosAutorizados;
    private List<Usuario> listaHistorialAccesos;


    public Documento(Integer id, String url, String contenido) {
        this.id = id;
        this.url = url;
        this.contenido = contenido;
        listaHistorialAccesos = new ArrayList<>();
        listaUsuariosAutorizados = new ArrayList<>();
    }

    public void agregarUsuariosAutorizados(Usuario usuario){
        listaUsuariosAutorizados.add(usuario);
    }

    public void agregarHistorial(Usuario usuario){
        listaHistorialAccesos.add(usuario);
    }

    @Override
    public void conectarConDocumento(Usuario usuario) {
        if (listaUsuariosAutorizados.contains(usuario) && this.url.equals(usuario.getUrl())){
            System.out.println("El contenido del documento es: " + contenido);
            listaHistorialAccesos.add(usuario);
        } else{
            System.out.println("Acceso denegado");
    }}

    public List<Usuario> getListaHistorialAccesos() {
        return listaHistorialAccesos;
    }




/*   Pensemos en una aplicación al estilo Google Drive, un servicio que nos trae documentos.
                Para acceder al mismo, debemos enviarle una url y un email. Los documentos están
        compuestos por una id, una url, un contenido y una lista de usuarios autorizados a verlo.
                Queremos registrar quiénes acceden a los documentos. ¿Cómo resolverías este problema
        aplicando el patrón proxy?*/
}
