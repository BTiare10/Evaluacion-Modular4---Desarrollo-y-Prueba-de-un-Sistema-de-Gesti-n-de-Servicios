package org.example.model;

public class Telefonia extends Servicio{

    public Telefonia(String nombre, double costoMensual){
        super(nombre, costoMensual);
    }
    @Override
    public double calcularCosto(){
        return getCostoMensual();
    }
}
