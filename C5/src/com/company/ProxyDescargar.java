package com.company;

public class ProxyDescargar implements IDescargar{
    private ServiceDescargar serviceDescargar = new ServiceDescargar();

    @Override
    public void descargar(Usuario usuario) {
        if (usuario.getTipoUsuario().equals("Premium")){
            serviceDescargar.descargar(usuario);
        } else{
            System.out.println("Acceso denegado");
        }

    }
}
