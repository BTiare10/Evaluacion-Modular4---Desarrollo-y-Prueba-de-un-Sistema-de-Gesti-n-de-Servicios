package org.example.Servicio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

    @ExtendWith(MockitoExtension.class)
    class AplicacionServicioTest {

        @Mock
        private Notificador notificadorMock;
        @InjectMocks
        private AplicacionServicio service;

        @BeforeEach
        void setUp() {

            service.registrarCliente("12345678-9", "Lucy");
        }

        @Test
        void testCalcularTotalMensualYNotificar() {

            service.registrarServicio("internet", 20000);
            service.registrarServicio("television", 10000);

            service.resumenCliente();

            verify(notificadorMock, times(1)).enviarNotificacion(anyString());
        }

    }
