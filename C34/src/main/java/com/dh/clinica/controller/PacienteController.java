package com.dh.clinica.controller;

import com.dh.clinica.persistence.dto.OdontologoDTO;
import com.dh.clinica.persistence.dto.PacienteDTO;
import com.dh.clinica.persistence.model.Odontologo;
import com.dh.clinica.persistence.model.Paciente;
import com.dh.clinica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping("/new")
    public ResponseEntity<PacienteDTO> registrarPaciente(@RequestBody PacienteDTO paciente) {

        return ResponseEntity.ok(pacienteService.crearPaciente(paciente));

    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteDTO> buscar(@PathVariable Integer id) {

        return ResponseEntity.ok(pacienteService.buscarPorId(id));
    }

    @PutMapping()
    public ResponseEntity<PacienteDTO> actualizar(@RequestBody PacienteDTO paciente) {
        ResponseEntity<PacienteDTO> response = null;

        if (paciente.getId() != null && pacienteService.buscarPorId(paciente.getId()) != null) {
            response = ResponseEntity.ok(pacienteService.modificarPaciente(paciente));
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id) {
        ResponseEntity<String> response = null;

        if (pacienteService.buscarPorId(id) != null) {
            pacienteService.eliminarPaciente(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Eliminado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return response;
    }

    @GetMapping("/listar")
    public ResponseEntity<Set<PacienteDTO>> buscarTodos(){
        return ResponseEntity.ok(pacienteService.buscarTodos());
    }


}
