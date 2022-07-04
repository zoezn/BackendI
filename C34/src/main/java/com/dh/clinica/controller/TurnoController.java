package com.dh.clinica.controller;

import com.dh.clinica.persistence.dto.TurnoDTO;
import com.dh.clinica.persistence.model.Turno;
import com.dh.clinica.service.OdontologoService;
import com.dh.clinica.service.PacienteService;
import com.dh.clinica.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    @Autowired
    private TurnoService turnoService;
    @Autowired
    private PacienteService pacienteService;
    @Autowired
    private OdontologoService odontologoService;

    @PostMapping("/new")
    public ResponseEntity<TurnoDTO> registrarTurno(@RequestBody TurnoDTO turno) {
        ResponseEntity<TurnoDTO> response;
        if (pacienteService.buscarPorId(turno.getPaciente().getId()) != null && odontologoService.buscarPorId(turno.getOdontologo().getId()) != null){
            response = ResponseEntity.ok(turnoService.crearTurno(turno));

    }else {
            response = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return response;


    }

    @GetMapping
    public ResponseEntity<Set<TurnoDTO>> listar() {
        return ResponseEntity.ok(turnoService.buscarTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id) {
        ResponseEntity<String> response;
        if (turnoService.buscarPorId(id) != null) {
            turnoService.eliminarTurno(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Eliminado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @PutMapping
    public ResponseEntity<TurnoDTO> actualizarTurno(@RequestBody TurnoDTO turno) {
        return ResponseEntity.ok(turnoService.modificarTurno(turno));

    }


}
