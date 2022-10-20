package com.educaionit.sobrecargaMetodos;

public class Sumador {

    public void sumar(Integer argumento1, Integer argumento2){
        Integer resultado = 0;
        resultado = argumento1 + argumento2;
        System.out.println("El resultado de la suma es: " + resultado.toString());
    }

    public void sumar(Float argumento1, Float argumento2){
        Float resultado = 0F;
        resultado = argumento1 + argumento2;
        System.out.println("El resultado de la suma es: " + resultado.toString());
    }

    public void sumar(Float argumento1, Integer argumento2){
        Float resultado = 0F;
        resultado = argumento1 + argumento2;
        System.out.println("El resultado de la suma es: " + resultado.toString());
    }

    public void sumar(String argumento1, String argumento2){
        String resultado = "";
        resultado = argumento1 + argumento2;
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
