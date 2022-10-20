package com.educaionit.getterSetter;

public class Perro {
    private String nombre;
    private String raza;
    private String color;
    private Integer edad;
    private String comportamiento;

    public Perro(String nombre, String raza){
        this.nombre = nombre;
        this.raza = raza;
    }

    public Perro(String nombre, String raza, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public Perro(String nombre, String raza, String color, Integer edad, String comportamiento) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.comportamiento = comportamiento;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                ", comportamiento='" + comportamiento + '\'' +
                '}';
    }
}
