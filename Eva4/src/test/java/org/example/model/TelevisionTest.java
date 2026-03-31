package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    Servicio television = new Television("Television", 40.0);

    @Test
    void testCalcularCosto() {
        double costo = television.calcularCosto();
        System.out.println("Costo calculado: " + costo);
        double expectedCosto = 40.0;
        assertEquals(expectedCosto, costo, "El costo calculado debe ser " + expectedCosto);

    }


}