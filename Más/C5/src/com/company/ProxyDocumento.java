package com.company;



import java.util.ArrayList;


public class ProxyDocumento implements LeerDocumento {
    private ServiceLeer serviceLeer = new ServiceLeer();
    private Usuario usuario;

    public ProxyDocumento(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void leerDocumento(Documento documento) {
        if (documento.getUsuariosAutorizados().contains(usuario.getMail()) && documento.getUrl().equals(usuario.getUrl())){
            System.out.println("Acceso autorizado, conectando con el service");
            documento.agregarHistorialAccesos(usuario.getMail());
            System.out.println("________________________________");
            serviceLeer.leerDocumento(documento);
        } else {
            System.out.println("Acceso denegado");
            System.out.println("________________________________");
        }
    }}
