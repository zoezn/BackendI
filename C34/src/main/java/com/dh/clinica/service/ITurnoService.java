package com.dh.clinica.service;


import com.dh.clinica.persistence.dto.TurnoDTO;
import com.dh.clinica.persistence.model.Turno;

import java.util.Set;

public interface ITurnoService {
    TurnoDTO crearTurno(TurnoDTO turnoDTO);
    TurnoDTO buscarPorId(Integer id);
    TurnoDTO modificarTurno(TurnoDTO turnoDTO);
    String eliminarTurno(Integer id);
    Set<TurnoDTO> buscarTodos();
}
