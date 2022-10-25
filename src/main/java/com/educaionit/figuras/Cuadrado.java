package com.educaionit.figuras;

public class Cuadrado extends Figura{

    private Integer lado;

    public Cuadrado(String color, String nombre, Integer lado) {
        super(color, nombre);
        this.lado = lado;
    }


    @Override
    public void calcularSuperficie() {
        Integer resultado = 0;
        resultado = lado * lado;
        System.out.println("La superficie del cuadrado es: " + resultado.toString());

    }

    public Integer getLado() {
        return lado;
    }

    public void setLado(Integer lado) {
        this.lado = lado;
    }
}
