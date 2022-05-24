package com.dh.banco;

import com.dh.banco.model.Cuenta;
import com.dh.banco.service.impl.AutenticationService;
import com.dh.banco.service.impl.BancoService;
import com.dh.banco.service.impl.CajaService;
import com.dh.banco.service.impl.CuentaService;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cuenta cuenta = new Cuenta(1, "asd", 500);

        AutenticationService autenticationService = new AutenticationService(cuenta);
        CuentaService cuentaService = new CuentaService(cuenta);
        CajaService cajaService = new CajaService(cuenta);

        BancoService service = new BancoService(autenticationService,cuentaService,cajaService);

        service.procesarCuenta(cuenta,200);







    }
}
