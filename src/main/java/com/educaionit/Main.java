package com.educaionit;

import com.educaionit.constructores.Persona;
import com.educaionit.encapsulamiento.CuentaBancaria;
import com.educaionit.getterSetter.Perro;
import com.educaionit.herencia.ClaseA;
import com.educaionit.herencia.ClaseB;
import com.educaionit.herencia.ClaseC;
import com.educaionit.sobrecargaMetodos.Sumador;

public class Main {
    public static void main(String[] args) {

        //Pruebas encapsulamiento
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.depositarDinero(550f);
        cuentaBancaria.setMoneda("Pesos");

        System.out.println("Cuenta Bancaria: Saldo= " + cuentaBancaria.obtenerSaldo());
        System.out.println("Cuenta Bancaria: Moneda= " + cuentaBancaria.obtenerMoneda());

        //cuentaBancaria.retirarDinero(300f);
        //System.out.println("Cuenta Bancaria: Saldo= " + cuentaBancaria.obtenerSaldo());

        cuentaBancaria.retirarDinero(900f);
        System.out.println("Cuenta Bancaria: Saldo= " + cuentaBancaria.obtenerSaldo());

        //Pruebas Herencia
        ClaseA claseA = new ClaseA();
        ClaseB claseB = new ClaseB();
        ClaseC claseC = new ClaseC();

        claseA.metodo1();
        claseA.metodo2();

        claseB.metodo1();
        claseB.metodo2();

        claseC.metodo1();
        claseC.metodo2();
        claseC.metodo3();

        //Pruebas Constructores
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Victor M");
        Persona persona3 = new Persona("Sergio P", 24);
        Persona persona4 = new Persona("Claudia H", 30, 45548789);

        //Pruebas sobrecarga de metodos

        Sumador sumador = new Sumador();

        //no se pueden ver los atributos porque no tiene getter ni setter hay que poner un breakpoint
        sumador.sumar(32,5);
        sumador.sumar(5F,2F);
        sumador.sumar(5F,3);
        sumador.sumar("Curso ","POO");

        //Prueba getter y setter
        Perro perro = new Perro("bobby", "labrador");
        perro.setNombre("Cucho");
        System.out.println("El nuevo nombre del perro es:" + perro.getNombre());
        System.out.println("El perro es:" + perro.toString());


    }
}