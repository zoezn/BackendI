package com.dh.clinica.controller;

import com.dh.clinica.persistence.dto.OdontologoDTO;
import com.dh.clinica.persistence.model.Odontologo;

import com.dh.clinica.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    @Autowired
    private OdontologoService odontologoService;

    @PostMapping("/new")
    public ResponseEntity<OdontologoDTO> registrarOdontologo(@RequestBody OdontologoDTO odontologo) {
        return ResponseEntity.ok(odontologoService.crearOdontologo(odontologo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OdontologoDTO> buscar(@PathVariable Integer id) {

        return ResponseEntity.ok(odontologoService.buscarPorId(id));
    }

    @PutMapping()
    public ResponseEntity<OdontologoDTO> actualizar(@RequestBody OdontologoDTO odontologo) {
        ResponseEntity<OdontologoDTO> response = null;

        if (odontologo.getId() != null && odontologoService.buscarPorId(odontologo.getId()) != null) {
            response = ResponseEntity.ok(odontologoService.modificarOdontologo(odontologo));
        }else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id) {
        ResponseEntity<String> response = null;

        if (odontologoService.buscarPorId(id) != null) {
            odontologoService.eliminarOdontologo(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Eliminado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return response;
    }
    @GetMapping
    public ResponseEntity<Set<OdontologoDTO>> buscarTodos(){
        return ResponseEntity.ok(odontologoService.buscarTodos());
    }



}
