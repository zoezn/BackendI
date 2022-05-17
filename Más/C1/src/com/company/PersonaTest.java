package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PersonaTest {
    Persona persona1;
    Persona persona;
    Persona persona2;



    @BeforeEach
    void doBefore() {
        persona = new Persona("Javier", "Test");
        persona.setEdad(LocalDate.of(2000, 4, 12));
        persona1 = new Persona("Vale", "Nov");
        persona1.setEdad(LocalDate.of(2003, 9, 20));
        persona2 = new Persona("Tito", "Perez");
        persona2.setEdad(LocalDate.of(2019, 12, 04));
    }

    @Test
    void getNombreCompleto(){
        assertEquals("Test, Javier", persona.mostrarNombre());
    }

    @Test
    void getEsMayorDe18() {
        assertEquals(persona.esMayor(), true);
        assertEquals(persona1.esMayor(), true);
        assertEquals(persona2.esMayor(), false);
    }

}