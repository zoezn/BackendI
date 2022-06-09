package com.dh.empresa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements Serializable {
    private String razonSocial;
    private int CUIT;
    private List<Empleado> listaEmpleados;

    public Empresa(String razonSocial, int CUIT) {
        this.razonSocial = razonSocial;
        this.CUIT = CUIT;
        listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleados (Empleado e) {
        listaEmpleados.add(e);
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCUIT() {
        return CUIT;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
}
