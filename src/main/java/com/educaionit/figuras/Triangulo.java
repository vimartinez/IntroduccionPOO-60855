package com.educaionit.figuras;

public class Triangulo extends Figura{

    private Integer base;
    private Integer altura;

    public Triangulo(String color, String nombre, Integer base, Integer altura) {
        super(color, nombre);
        this.base = base;
        this.altura = altura;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    @Override
    public void calcularSuperficie() {
        Double resultado = 0.0;
        resultado = (double) (base * altura) / 2;
        System.out.println("La superficie del triángulo es: " + resultado.toString());
    }


}
