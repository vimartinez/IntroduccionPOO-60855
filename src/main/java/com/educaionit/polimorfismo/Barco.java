package com.educaionit.polimorfismo;

public class Barco extends Vehiculo{
    public Barco(String marca, String modelo, Integer combustible) {
        super(marca, modelo, combustible);
    }

    @Override
    public void desplazarse(Integer metros) {
        System.out.println("el barco se desplaza " + metros + " metros");
    }
}
