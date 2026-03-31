package org.example.Servicio;

import org.example.model.*;

public class AplicacionServicio {

    private Cliente cliente;
    private Notificador notificador;

    public AplicacionServicio(Notificador notificador){
        this.notificador = notificador;
    }

    public void registrarCliente(String rut, String nombre) {
        this.cliente = new Cliente(rut, nombre);
    }

    public void registrarServicio(String nombreServicio, double costoMensual) {

        Servicio nuevoServicio;
        switch (nombreServicio.toLowerCase()) {
            case "internet" -> nuevoServicio = new Internet(nombreServicio, costoMensual);
            case "telefonia" -> nuevoServicio = new Telefonia(nombreServicio, costoMensual);
            case "television" -> nuevoServicio = new Television(nombreServicio, costoMensual);
            default -> throw new IllegalArgumentException("Servicio no reconocido: " + nombreServicio);
        }

        if (cliente != null) {
            cliente.agregarServicio(nuevoServicio);
        }
    }

    public void resumenCliente() {
        if (cliente == null) {
            System.out.println("No hay cliente registrado.");
            return;
        }

        double costoTotal = 0.0;
        System.out.println("Resumen del Cliente:");
        System.out.println("RUT: " + cliente.getRut());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Servicios Contratados:");

        for (Servicio s : cliente.getServicios()) {
            System.out.println("- " + s.getNombre() + ": $" + s.calcularCosto());
            costoTotal += s.calcularCosto();
        }

        System.out.println("Total a Pagar: $" + costoTotal);


        if (notificador != null) {
            notificador.enviarNotificacion("El total de su boleta es: $" + costoTotal);
        }
    }
}