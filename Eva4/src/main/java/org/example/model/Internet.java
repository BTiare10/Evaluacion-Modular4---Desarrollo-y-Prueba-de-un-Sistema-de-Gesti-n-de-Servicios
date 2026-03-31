package org.example.model;

public class Internet extends Servicio{

    public Internet(String nombre, double costoMensual){
        super(nombre, costoMensual);
    }
    @Override
    public double calcularCosto(){
        return getCostoMensual();
    }
}
