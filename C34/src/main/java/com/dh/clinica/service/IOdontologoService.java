package com.dh.clinica.service;

import com.dh.clinica.persistence.dto.OdontologoDTO;

import java.util.Set;

public interface IOdontologoService {

    OdontologoDTO crearOdontologo(OdontologoDTO odontologoDTO);
    OdontologoDTO buscarPorId(Integer id);
    OdontologoDTO modificarOdontologo(OdontologoDTO odontologoDTO);
    String eliminarOdontologo(Integer id);
    Set<OdontologoDTO> buscarTodos();
}
