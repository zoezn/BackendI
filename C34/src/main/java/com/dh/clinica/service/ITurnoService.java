package com.dh.clinica.service;


import com.dh.clinica.excepciones.ResourceNotFoundException;
import com.dh.clinica.persistence.dto.TurnoDTO;
import com.dh.clinica.persistence.model.Turno;

import java.util.Set;

public interface ITurnoService {
    TurnoDTO crearTurno(TurnoDTO turnoDTO) throws ResourceNotFoundException;
    TurnoDTO buscarPorId(Integer id);
    TurnoDTO modificarTurno(TurnoDTO turnoDTO) throws ResourceNotFoundException;
    String eliminarTurno(Integer id);
    Set<TurnoDTO> buscarTodos();
}
