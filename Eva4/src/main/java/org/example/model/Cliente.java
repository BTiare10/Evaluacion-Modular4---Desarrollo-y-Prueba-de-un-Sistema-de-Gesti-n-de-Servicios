package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String rut;
    private String nombre;
    private List<Servicio> servicios = new ArrayList<>();

    public Cliente() {
        this.servicios = new ArrayList<>();
    }

    public Cliente(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
        this.servicios = new ArrayList<>();
    }

    public String getRut() {

        return rut;
    }

    public void setRut(String rut) {

        this.rut = rut;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void agregarServicio(Servicio servicio) {
        this.servicios.add(servicio);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", servicios=" + servicios +
                '}';
    }
}