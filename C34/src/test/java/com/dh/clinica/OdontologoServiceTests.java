package com.dh.clinica;

import com.dh.clinica.persistence.dto.OdontologoDTO;
import com.dh.clinica.persistence.model.Odontologo;
import com.dh.clinica.service.OdontologoService;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnit4.class)
@SpringBootTest
public class OdontologoServiceTests {

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
