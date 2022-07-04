package com.dh.clinica.service;

import com.dh.clinica.persistence.dto.OdontologoDTO;
import com.dh.clinica.persistence.dto.PacienteDTO;
import com.dh.clinica.persistence.dto.TurnoDTO;
import com.dh.clinica.persistence.model.Odontologo;
import com.dh.clinica.persistence.model.Paciente;
import com.dh.clinica.persistence.model.Turno;
import com.dh.clinica.persistence.repository.ITurnoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class TurnoService implements ITurnoService{

    @Autowired
    private ITurnoRepository turnoRepository;
    @Autowired
    private PacienteService pacienteService;
    @Autowired
    private OdontologoService odontologoService;
    @Autowired
    ObjectMapper mapper;

    @Override
    public TurnoDTO crearTurno(TurnoDTO turnoDTO) {
        Integer pID = turnoDTO.getPaciente().getId();
        Integer oID = turnoDTO.getOdontologo().getId();
        turnoDTO.setOdontologo(mapper.convertValue(odontologoService.buscarPorId(oID), Odontologo.class));
        turnoDTO.setPaciente(mapper.convertValue(pacienteService.buscarPorId(pID), Paciente.class));

        Turno t = mapper.convertValue(turnoDTO, Turno.class);
        Turno t2 = turnoRepository.save(t);


        return mapper.convertValue(t2, TurnoDTO.class);
    }

    @Override
    public TurnoDTO buscarPorId(Integer id) {
        Optional<Turno> t = turnoRepository.findById(id);
        TurnoDTO tDTO= null;
        if (t.isPresent()){
            tDTO = mapper.convertValue(t, TurnoDTO.class);
        }
        return tDTO;
    }

    @Override
    public TurnoDTO modificarTurno(TurnoDTO turnoDTO) {
        return crearTurno(turnoDTO);
    }

    @Override
    public String eliminarTurno(Integer id) {
        if (turnoRepository.findById(id).isPresent()){
            turnoRepository.deleteById(id);
            return "El turno con id " + id + " ha sido eliminado.";
        }
        return "El turno con id " + id + " no fue encontrado.";
    }

    @Override
    public Set<TurnoDTO> buscarTodos() {
        List<Turno> turnoList = turnoRepository.findAll();
        Set<TurnoDTO> turnoDTOList = new HashSet<TurnoDTO>();
        TurnoDTO tDTO = null;

        for (Turno t : turnoList){
            tDTO = mapper.convertValue(t, TurnoDTO.class);
            turnoDTOList.add(tDTO);
        }
        return turnoDTOList;

    }

}
