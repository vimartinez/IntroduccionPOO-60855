package com.educaionit.staticconstant;

public class Circulo2 {

    public static final double PI = 3.141592;
    public static Integer cantCirculo2 = 0;
    private static Integer cant2Circulo2 = 10;
    private String color;
    private String nombre;

    public Circulo2(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
        cantCirculo2++;
    }

    public static Integer getCant2Circulo2() {
        return cant2Circulo2;
    }

    public static void setCant2Circulo2(Integer cant2Circulo2) {
        Circulo2.cant2Circulo2 = cant2Circulo2;
    }

    public static Double calcularSuperficieCirculo(Integer radio){
        return PI * radio * radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
