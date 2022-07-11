package com.dh.clinica;

import com.dh.clinica.excepciones.ResourceNotFoundException;
import com.dh.clinica.persistence.dto.OdontologoDTO;
import com.dh.clinica.persistence.model.Odontologo;
import com.dh.clinica.service.OdontologoService;

import org.junit.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

/*@FixMethodOrder(MethodSorters.NAME_ASCENDING)*/
/*@RunWith(JUnit4.class)*/
/*@SpringBootTest*/
/*@RunWith(SpringRunner.class)*/
/*@DataJpaTest
@SpringBootTest(classes=ClinicaOdontologicaApplication.class)*/
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class OdontologoServiceTests {

    @Autowired
    private OdontologoService odontologoService;

    @BeforeAll
    public void cargarPrimerOdontologo(){
        OdontologoDTO o = new OdontologoDTO();
        o.setNombre("Zoe");
        o.setApellido("Jimenez");
        o.setMatricula(222);
        o = odontologoService.crearOdontologo(o);
    }

    @Test
    public void cargarOdontologo(){
        OdontologoDTO o = new OdontologoDTO();
        o.setNombre("Profe");
        o.setApellido("Peter");
        o.setMatricula(123);
        o = odontologoService.crearOdontologo(o);

        Assert.assertTrue(o.getId() != null);
    }

    @Test
    public void traerOdontologoID() throws ResourceNotFoundException {
        OdontologoDTO o = new OdontologoDTO();
        o = odontologoService.buscarPorId(1);

        Assert.assertTrue(o != null);
    }
/*
    private static OdontologoService odontologoService;

    @BeforeAll
    public static void cargarDataSet() {
        OdontologoDTO o = new OdontologoDTO(1, "Santiago", "Paz", 3455647);
        odontologoService.crearOdontologo(o);
    }

    @Test
    public void guardarOdontologo() {
        OdontologoDTO odontologo = odontologoService.crearOdontologo(new OdontologoDTO(2, "Juan", "Ramirez", 348971960));
        Assert.assertTrue(odontologo.getId() != null);
    }

    @Test
    public void eliminarOdontologoTest() {
        odontologoService.eliminarOdontologo(1);
        Assert.assertTrue(odontologoService.buscarPorId(1) == null);

    }

    @Test
    public void traerTodos() {
        Set<OdontologoDTO> odontologos = odontologoService.buscarTodos();
        Assert.assertTrue(!odontologos.isEmpty());
        Assert.assertTrue(odontologos.size() > 0);
        System.out.println(odontologos);
    }*/

}
