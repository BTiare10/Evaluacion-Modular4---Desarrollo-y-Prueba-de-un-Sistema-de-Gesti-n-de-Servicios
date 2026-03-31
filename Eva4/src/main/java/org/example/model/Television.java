package org.example.model;

public class Television extends Servicio{

    public Television(String nombre, double costoMensual){
        super(nombre, costoMensual);
    }
    @Override
    public double calcularCosto(){
        return getCostoMensual();
    }
}
