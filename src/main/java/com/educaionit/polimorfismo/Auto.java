package com.educaionit.polimorfismo;

public class Auto extends Vehiculo{

    public Auto(String marca, String modelo, Integer combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void desplazarse(Integer metros) {
        System.out.println("el auto se desplaza " + metros + " metros");
    }
}
