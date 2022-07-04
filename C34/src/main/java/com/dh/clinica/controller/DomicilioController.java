package com.dh.clinica.controller;

import com.dh.clinica.persistence.dto.DomicilioDTO;
import com.dh.clinica.persistence.model.Domicilio;
import com.dh.clinica.persistence.model.Odontologo;
import com.dh.clinica.persistence.model.Paciente;
import com.dh.clinica.service.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController {
    @Autowired
    private DomicilioService domicilioService;



    @GetMapping("/{id}")
    public ResponseEntity<DomicilioDTO> buscar(@PathVariable Integer id) {
        DomicilioDTO domicilio = domicilioService.buscarPorId(id);
        return ResponseEntity.ok(domicilio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id) {
        ResponseEntity<String> response = null;

        if (domicilioService.buscarPorId(id) != null) {
            domicilioService.eliminarDomicilio(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Eliminado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return response;
    }

    @GetMapping
    public ResponseEntity<Set<DomicilioDTO>> buscarTodos(){
        return ResponseEntity.ok(domicilioService.buscarTodos());
    }


}
