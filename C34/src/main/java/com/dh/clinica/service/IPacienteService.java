package com.dh.clinica.service;

import com.dh.clinica.persistence.dto.PacienteDTO;

import java.util.Set;

public interface IPacienteService {

    PacienteDTO crearPaciente(PacienteDTO pacienteDTO);
    PacienteDTO buscarPorId(Integer id);
    PacienteDTO modificarPaciente(PacienteDTO pacienteDTO);
    String eliminarPaciente(Integer id);
    Set<PacienteDTO> buscarTodos();
}
