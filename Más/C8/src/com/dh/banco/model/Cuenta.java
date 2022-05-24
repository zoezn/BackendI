package com.dh.banco.model;

public class Cuenta {
    private Integer dni;
    private String contrasena;
    private Integer saldo;

    public Cuenta(Integer dni, String contrasena, Integer saldo) {
        this.dni = dni;
        this.contrasena = contrasena;
        this.saldo = saldo;
    }


    public Integer getDni() {
        return dni;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
}
