package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class ProgramaTest {
     Programa circulo;
     Programa cuadrado;

     @BeforeEach
     void doBefore(){
          circulo = new Programa("Circulo");
          circulo.setRadio(2.0);
          circulo.setLados(0.0);
          cuadrado = new Programa("Cuadrado");
          cuadrado.setLados(4.0);
          cuadrado.setRadio(0.0);
     }

     @Test
     void calcularArea() {
          assertEquals("El área del Circulo es 12.566370614359172 unidades.", circulo.calcularArea());
          assertEquals("El área del Cuadrado es 8.0 unidades.", cuadrado.calcularArea());
     }

}