package org.example.model;

public abstract class Servicio {

    private String nombre;
    private double costoMensual;

    public Servicio(String nombre, double costoMensual) {
        this.nombre = nombre;
        this.costoMensual = costoMensual;

    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public double getCostoMensual() {

        return costoMensual;
    }

    public void setCostoMensual(double costoMensual) {

        this.costoMensual = costoMensual;
    }

    public abstract double calcularCosto();

    @Override
    public String toString() {
        return "Servicio{" +
                "nombre='" + nombre + '\'' +
                ", costoMensual=" + costoMensual +
                '}';
    }
}
