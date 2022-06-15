package com.dh.clinica.service;


import com.dh.clinica.model.Domicilio;
import com.dh.clinica.repository.IDao;
import com.dh.clinica.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente guardar(Paciente paciente) {
        paciente.setFechaIngreso(new Date());
        //paciente.setDomicilio(new Domicilio(1, "calle2", "1223", "localidad", "TDF"));
        return pacienteIDao.guardar(paciente);
    }

    public Paciente buscar(Integer id) {
        return pacienteIDao.buscar(id);
    }

    public List<Paciente> buscarTodos() {
        return pacienteIDao.buscarTodos();
    }

    public void eliminar(Integer id) {
        pacienteIDao.eliminar(id);
    }

    public Paciente actualizar(Paciente p) {
        return pacienteIDao.actualizar(p);
    }
}
