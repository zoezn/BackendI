package com.dh.banco.service.impl;

import com.dh.banco.model.Cuenta;

public class CuentaService {
    private Cuenta cuenta;

    public CuentaService(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int getCuenta(Integer dni){
        if (cuenta.getDni().equals(dni)){
           /* return cuenta.getDni();*/
            System.out.println("Su saldo actual es de " + cuenta.getSaldo());
            return cuenta.getSaldo();
        } else {
            return 0;
        }



    }
}
