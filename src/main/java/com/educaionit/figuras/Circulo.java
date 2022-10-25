package com.educaionit.figuras;

public class Circulo extends Figura{

    private static final Double PI = 3.14159265;
    private Integer radio;

    public Circulo(String color, String nombre, Integer radio) {
        super(color, nombre);
        this.radio = radio;
    }

    @Override
    public void calcularSuperficie() {
        Double resultado = 0.0;
        resultado = PI * radio * radio;
        System.out.println("La superficie del círculo es: " + resultado.toString());
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }
}
