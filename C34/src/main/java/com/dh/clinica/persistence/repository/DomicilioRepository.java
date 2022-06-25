package com.dh.clinica.persistence.repository;

import com.dh.clinica.persistence.model.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomicilioRepository extends JpaRepository <Domicilio, Long> {
}
