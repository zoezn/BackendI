package com.dh.banco.service.impl;

import com.dh.banco.model.Cuenta;

public class CajaService {
    private Cuenta cuenta;

    public CajaService(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int entregarDinero(Integer importe){
        if (cuenta.getSaldo() >= importe){
            int nuevoSaldo = cuenta.getSaldo() - importe;
            cuenta.setSaldo(nuevoSaldo);
            System.out.println("Se retiraron " + importe + ", su nuevo saldo es de " + cuenta.getSaldo());
            return cuenta.getSaldo();
        } else {
            System.out.println("No es posible retirar ese importe, su saldo es de: " + cuenta.getSaldo());
            return cuenta.getSaldo();
        }
    }



}
