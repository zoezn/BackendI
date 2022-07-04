package com.dh.clinica.service;

import com.dh.clinica.persistence.dto.DomicilioDTO;

import java.util.Set;

public interface IDomicilioService {

    DomicilioDTO crearDomicilio(DomicilioDTO domicilioDTO);
    DomicilioDTO buscarPorId(Integer id);
    DomicilioDTO modificarDomicilio(DomicilioDTO domicilioDTO);
    String eliminarDomicilio(Integer id);
    Set<DomicilioDTO> buscarTodos();
}
