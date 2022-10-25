package com.educaionit.figuras;

public abstract class Figura {

    private String color;
    private String nombre;

    public Figura(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
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

    public void copiar(){
        System.out.println("Se copió la figura");
    }

    public void mover(){
        System.out.println("Se movió la figura");
    }

    public void borrar(){
        System.out.println("Se borró la figura");
    }

    public abstract void calcularSuperficie();
}
