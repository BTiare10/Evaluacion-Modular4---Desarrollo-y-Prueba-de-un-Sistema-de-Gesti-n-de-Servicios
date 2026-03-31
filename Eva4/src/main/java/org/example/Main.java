package org.example;

import org.example.Servicio.AplicacionServicio;
import org.example.Servicio.Notificador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Notificador notificador = new Notificador();

        AplicacionServicio service = new AplicacionServicio(notificador);

        int opcion = 0;

        System.out.println("--- Registro Incial de Cliente ---");
        System.out.print("Ingrese su RUT: ");
        String rut = sc.nextLine();
        System.out.print("Ingrese su Nombre: ");
        String nombre = sc.nextLine();


        service.registrarCliente(rut, nombre);

        do {
            System.out.println("\n--- Menú de Servicios ---");
            System.out.println("1. Agregar Internet");
            System.out.println("2. Agregar Telefonía");
            System.out.println("3. Agregar Televisión");
            System.out.println("4. Mostrar Resumen y Salir");
            System.out.print("Seleccione una opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1 -> service.registrarServicio("Internet", 25000);
                    case 2 -> service.registrarServicio("Telefonia", 15000);
                    case 3 -> service.registrarServicio("Television", 18000);
                    case 4 -> service.resumenCliente();
                    default -> System.out.println("Opción no válida.");
                }
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                sc.next();
            }

        } while (opcion != 4);

        sc.close();
        System.out.println("\n¡Gracias por usar el sistema!");
    }
}