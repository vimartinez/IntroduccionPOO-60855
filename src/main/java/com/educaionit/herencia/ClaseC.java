package com.educaionit.herencia;

public class ClaseC extends ClaseB{

    public void metodo1(){
        System.out.println("Clase C - Método 1");
    }
    public void metodo2(){
        //super ejecuta el método de la clase padre
        //en este caso existe metodo 1 en clase b por eso se ejecuta
        super.metodo1();
    }
    public void metodo3(){
        //en este caso no existe método 2 en clase b por lo tanto se va a clase a (padre de b) donde existe
        super.metodo2();
    }
}
