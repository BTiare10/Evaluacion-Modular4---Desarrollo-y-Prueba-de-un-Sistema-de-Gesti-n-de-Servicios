package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoniaTest {

    Servicio telefonia = new Telefonia("Telefonia", 30.0);

    @Test
    void testCalcularCosto() {
        double costo = telefonia.calcularCosto();
        System.out.println("Costo calculado: " + costo);
        double expectedCosto = 30.0;
        assertEquals(expectedCosto, costo, "El costo calculado debe ser " + expectedCosto);

    }
}