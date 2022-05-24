package com.dh.banco.service.impl;

import com.dh.banco.model.Cuenta;

public class AutenticationService {
    private Cuenta cuenta;

    public AutenticationService(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public boolean validarUsuarioYContrasena(Integer dni, String contrasena){
        if (cuenta.getDni().equals(dni) && cuenta.getContrasena().equals(contrasena)){
            System.out.println("Los datos ingresados son validos");
            return true;
        } else {
            System.out.println("Los datos ingresados son incorrectos");
            return false;
        }
    }


}
