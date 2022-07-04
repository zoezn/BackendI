package com.dh.clinica;


import com.dh.clinica.persistence.dto.DomicilioDTO;
import com.dh.clinica.persistence.dto.PacienteDTO;
import com.dh.clinica.persistence.model.Domicilio;
import com.dh.clinica.persistence.model.Paciente;
import com.dh.clinica.service.DomicilioService;
import com.dh.clinica.service.PacienteService;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnit4.class)
@SpringBootTest
public class PacienteServiceTest {
    /*private static PacienteService pacienteService;
    private DomicilioService domicilioService;

    @BeforeClass
    public static void cargarDataSet() {
        Domicilio domicilio = new Domicilio( "Av Santa fe", "444", "CABA", "Buenos Aires");
        PacienteDTO p = pacienteService.crearPaciente(new PacienteDTO(1, "Santiago", "Paz", "88888888", new Date(), domicilio));
        Domicilio domicilio2 = new Domicilio( "Av Avellaneda", "333", "CABA", "Buenos Aires");
        PacienteDTO p2 = pacienteService.crearPaciente(new PacienteDTO(2, "Micaela", "Perez", "99999999", new Date(), domicilio2));

    }

    @Test
    public void agregarYBuscarPacienteTest() {
        Domicilio domicilio = new Domicilio("Calle", "123", "Temperley", "Buenos Aires");
        PacienteDTO p = pacienteService.crearPaciente(new PacienteDTO(3, "Tomas", "Pereyra", "12345678", new Date(), domicilio));

        Assert.assertNotNull(pacienteService.buscarPorId(p.getId()));
    }

    @Test
    public void eliminarPacienteTest() {
        pacienteService.eliminarPaciente(3);
        Assert.assertTrue(pacienteService.buscarPorId(3) == null);

    }*/
/*
    @Test
    public void traerTodos() {
        List<Paciente> pacientes = pacienteService.buscarTodos();
        Assert.assertTrue(!pacientes.isEmpty());
        Assert.assertTrue(pacientes.size() > 0);
        System.out.println(pacientes);
    }*/


}
