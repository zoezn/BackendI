package com.dh.banco.service.impl;

import com.dh.banco.model.Cuenta;
import com.dh.banco.service.IBancoService;

public class BancoService implements IBancoService {
    private AutenticationService autenticationService;
    private CuentaService cuentaService;
    private CajaService cajaService;

    public BancoService(AutenticationService autenticationService, CuentaService cuentaService, CajaService cajaService) {
        this.autenticationService = autenticationService;
        this.cuentaService = cuentaService;
        this.cajaService = cajaService;
    }

    @Override
    public void procesarCuenta(Cuenta cuenta, Integer importe) {

        if (autenticationService.validarUsuarioYContrasena(cuenta.getDni(), cuenta.getContrasena())){
            cuentaService.getCuenta(cuenta.getDni());
            cajaService.entregarDinero(importe);
        }





    }
}
