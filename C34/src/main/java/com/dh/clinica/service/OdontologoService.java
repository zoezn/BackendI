package com.dh.clinica.service;

import com.dh.clinica.persistence.dto.OdontologoDTO;
import com.dh.clinica.persistence.model.Odontologo;
import com.dh.clinica.persistence.repository.IOdontologoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class OdontologoService implements IOdontologoService{

    @Autowired
    private IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public OdontologoDTO crearOdontologo(OdontologoDTO odontologoDTO) {
        Odontologo o = mapper.convertValue(odontologoDTO, Odontologo.class);
        Odontologo nuevoO = odontologoRepository.save(o);
        return mapper.convertValue(nuevoO, OdontologoDTO.class);
    }

    @Override
    public OdontologoDTO buscarPorId(Integer id) {
        Optional<Odontologo> o = odontologoRepository.findById(id);
        OdontologoDTO oDTO = null;
        if (o.isPresent()){
            oDTO = mapper.convertValue(o, OdontologoDTO.class);
        }
        return oDTO;
    }

    @Override
    public OdontologoDTO modificarOdontologo(OdontologoDTO odontologoDTO) {
        OdontologoDTO o = buscarPorId(odontologoDTO.getId());
        if (odontologoDTO.getNombre() != null){
            o.setNombre(odontologoDTO.getNombre());
        }
        if (odontologoDTO.getApellido() != null){
            o.setApellido(odontologoDTO.getApellido());
        }
        if (odontologoDTO.getMatricula() != null){
            o.setMatricula(odontologoDTO.getMatricula());
        }

        return crearOdontologo(o);
    }

    @Override
    public String eliminarOdontologo(Integer id) {
        if (odontologoRepository.findById(id).isPresent()){
            odontologoRepository.deleteById(id);
            return "El odontologo con id " + id + " ha sido eliminado.";
        }
        return "El odontologo con id " + id + " no fue encontrado.";

    }

    @Override
    public Set<OdontologoDTO> buscarTodos() {
        List<Odontologo> odontologoList = odontologoRepository.findAll();

        Set<OdontologoDTO> odontologoDTOList = new HashSet<OdontologoDTO>();

        OdontologoDTO oDTO = null;

        for (Odontologo o: odontologoList){
            oDTO = mapper.convertValue(o, OdontologoDTO.class);
            odontologoDTOList.add(oDTO);
        }

        return odontologoDTOList;
    }


}
