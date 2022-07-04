package com.dh.clinica.service;


import com.dh.clinica.persistence.dto.DomicilioDTO;
import com.dh.clinica.persistence.dto.OdontologoDTO;
import com.dh.clinica.persistence.model.Domicilio;
import com.dh.clinica.persistence.model.Odontologo;
import com.dh.clinica.persistence.repository.IDomicilioRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class DomicilioService implements IDomicilioService{
    @Autowired
    private IDomicilioRepository domicilioRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public DomicilioDTO crearDomicilio(DomicilioDTO domicilioDTO) {
        Domicilio d = mapper.convertValue(domicilioDTO, Domicilio.class);
        Domicilio nuevoD = domicilioRepository.save(d);
        return mapper.convertValue(nuevoD, DomicilioDTO.class);

    }

    @Override
    public DomicilioDTO buscarPorId(Integer id) {
        Optional<Domicilio> d = domicilioRepository.findById(id);
        DomicilioDTO dDTO = null;
        if (d.isPresent()){
            dDTO = mapper.convertValue(d, DomicilioDTO.class);
        }
        return dDTO;
    }

    @Override
    public DomicilioDTO modificarDomicilio(DomicilioDTO domicilioDTO) {
        DomicilioDTO d = buscarPorId(domicilioDTO.getId());
        if (domicilioDTO.getCalle() != null) {
            d.setCalle(domicilioDTO.getCalle());
        }
        if (domicilioDTO.getLocalidad() != null) {
            d.setLocalidad(domicilioDTO.getLocalidad());
        }
        if (domicilioDTO.getProvincia() != null) {
            d.setProvincia(domicilioDTO.getProvincia());
        }
        if (domicilioDTO.getNumero() != null) {
            d.setNumero(domicilioDTO.getNumero());
        }

        return crearDomicilio(d);
    }

    @Override
    public String eliminarDomicilio(Integer id) {
        if (domicilioRepository.findById(id).isPresent()){
            domicilioRepository.deleteById(id);
            return "El domicilio con id " + id + " ha sido eliminado.";
        }
        return "El domicilio con id " + id + " no fue encontrado.";

    }

    @Override
    public Set<DomicilioDTO> buscarTodos() {
        List<Domicilio> domicilioList = domicilioRepository.findAll();

        Set<DomicilioDTO> domicilioDTOList = new HashSet<DomicilioDTO>();

        DomicilioDTO dDTO = null;

        for (Domicilio d: domicilioList){
            dDTO = mapper.convertValue(d, DomicilioDTO.class);
            domicilioDTOList.add(dDTO);
        }

        return domicilioDTOList;
    }



}
