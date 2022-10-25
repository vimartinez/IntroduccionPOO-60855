package com.educaionit.figuras;

public class Rectangulo extends Figura{

    private Integer lado1;
    private Integer lado2;

    public Rectangulo(String color, String nombre, Integer lado1, Integer lado2) {
        super(color, nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Integer getLado1() {
        return lado1;
    }

    public void setLado1(Integer lado1) {
        this.lado1 = lado1;
    }

    public Integer getLado2() {
        return lado2;
    }

    public void setLado2(Integer lado2) {
        this.lado2 = lado2;
    }

    @Override
    public void calcularSuperficie() {
        Integer resultado = 0;
        resultado = lado1 * lado2;
        System.out.println("La superficie del rectángulo es: " + resultado.toString());
    }

}
