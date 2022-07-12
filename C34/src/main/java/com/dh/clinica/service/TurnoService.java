package com.dh.clinica.service;

import com.dh.clinica.persistence.repository.IDao;
import com.dh.clinica.persistence.model.Turno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoService {

    private IDao<Turno> turnoRepository;

    public TurnoService(IDao<Turno> turnoRepository) {
        this.turnoRepository = turnoRepository;
    }

    public Turno registrarTurno(Turno turno){
        return  turnoRepository.guardar(turno);
    }
    public List<Turno> listar(){
        return turnoRepository.buscarTodos();
    }
    public void eliminar(Integer id){
        turnoRepository.eliminar(id);
    }
    public Turno actualizar(Turno turno){
        return turnoRepository.actualizar(turno);
    }
    public Turno buscar(Integer id){
        return turnoRepository.buscar(id);
    }

}
