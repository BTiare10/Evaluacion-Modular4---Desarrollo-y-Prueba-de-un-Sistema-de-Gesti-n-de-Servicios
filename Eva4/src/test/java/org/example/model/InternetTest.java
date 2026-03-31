package org.example.model;

import com.sun.management.UnixOperatingSystemMXBean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InternetTest {

    Servicio internet = new Internet("Internet", 50.0);

    @Test
    void testCalcularCosto() {
        double costo = internet.calcularCosto();
        System.out.println("Costo calculado: " + costo);
        double expectedCosto = 50.0;
        assertEquals(expectedCosto, costo, "El costo calculado debe ser " + expectedCosto);
    }



}