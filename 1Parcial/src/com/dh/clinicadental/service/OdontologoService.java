package com.dh.clinicadental.service;

import com.dh.clinicadental.dao.IDao;
import com.dh.clinicadental.model.Odontologo;

import java.util.List;

public class OdontologoService {
    private IDao<Odontologo> odontologoDao;

    public OdontologoService(IDao<Odontologo> odontologoDao) {
        this.odontologoDao = odontologoDao;
    }

    public Odontologo guardar(Odontologo odontologo){
        odontologoDao.guardar(odontologo);
        return odontologo;
    }

    public List<Odontologo> listar(){
        return odontologoDao.listar();
    }

}
