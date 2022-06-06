package test.com.dh.clinica.service;

import com.dh.clinica.dao.impl.OdontologoDaoH2;
import com.dh.clinica.model.Odontologo;
import com.dh.clinica.service.OdontologoService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;


import java.util.List;

public class OdontologoServiceTest {

    private static OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());


    @BeforeClass
    public static void cargarData() {
        Odontologo odontologo1 = new Odontologo(123, "Juan", "Perez");
        Odontologo odontologo2 = new Odontologo(222, "Maria", "Gutierrez");
        Odontologo odontologo3 = new Odontologo(777, "Vanesa", "Morales");
        odontologoService.guardar(odontologo1);
        odontologoService.guardar(odontologo2);
        odontologoService.guardar(odontologo3);

    }


    @Test
    public void listarTodos() {
        List<Odontologo> odontologos = odontologoService.listar();
        Assert.assertTrue(!odontologos.isEmpty());
        Assert.assertTrue(odontologos.size() > 0);
        System.out.println(odontologos);
    }


}
