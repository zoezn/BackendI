package com.dh.clinica.persistence.repository;

import com.dh.clinica.persistence.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository <Paciente, Integer>{
}
