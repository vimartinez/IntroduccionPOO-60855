package com.educaionit;

import com.educaionit.constructores.Persona;
import com.educaionit.encapsulamiento.CuentaBancaria;
import com.educaionit.figuras.*;
import com.educaionit.getterSetter.Perro;
import com.educaionit.herencia.ClaseA;
import com.educaionit.herencia.ClaseB;
import com.educaionit.herencia.ClaseC;
import com.educaionit.polimorfismo.Auto;
import com.educaionit.polimorfismo.Barco;
import com.educaionit.polimorfismo.Helicoptero;
import com.educaionit.polimorfismo.Vehiculo;
import com.educaionit.sobrecargaMetodos.Sumador;
import com.educaionit.staticconstant.Circulo2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
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

        //Pruebas de Polimorfismo

        System.out.println("Polimorfismo");
        Auto auto1 = new Auto("VW","Vento", 30);
        Auto auto2 = new Auto("Ford","Focus", 40);
        Auto auto3 = new Auto("Ferrari","F1", 30);

        List<Vehiculo> flota = new ArrayList<Vehiculo>();

        flota.add(auto1);
        flota.add(auto2);
        flota.add(auto3);

        for (Vehiculo vehiculo: flota) {
            vehiculo.desplazarse(150);
        }
        System.out.println("Segunda Iteración");

        Barco barco1 = new Barco("BarcoMarca","modeloBarco",250);
        Helicoptero heli1 = new Helicoptero("helico", "modeloHeli",150);

        flota.add(barco1);
        flota.add(heli1);

        for (Vehiculo vehiculo: flota) {
            vehiculo.desplazarse(150);
        }
        */


        System.out.println("Ejercicio 4 - Figuras");

        List<Figura> figs = new ArrayList<Figura>();
        figs.add(new Circulo("Rojo","Circulo1",5));
        figs.add(new Cuadrado("Rojo","cuadrado1",5));
        figs.add(new Triangulo("Azul","Tri1",5, 15));
        figs.add(new Circulo("Verde","Circulo2",15));
        figs.add(new Rectangulo("Marrón","Rec1",5,10));
        figs.add(new Cuadrado("Rojo","cuadrado2",10));

        for (Figura figura: figs) {
            System.out.println(figura.getNombre() + " " + figura.getColor());
            figura.calcularSuperficie();

        }

        //Ejemplo de static

        System.out.println("Metodos de Clase");

        System.out.println(Circulo2.PI);
        //System.out.println(Circulo2.cantCirculo2);
        //Circulo2.cantCirculo2 = 5;
        System.out.println(Circulo2.cantCirculo2);
        Circulo2.setCant2Circulo2(45);
        System.out.println(Circulo2.getCant2Circulo2());
        Double supCirculo = Circulo2.calcularSuperficieCirculo(10);
        System.out.println("La superficie del círculo de radio 10 es:" + supCirculo.toString());

        Circulo2 C1 = new Circulo2("Rojo", "C1");
        Circulo2 C2 = new Circulo2("Rojo", "C2");
        Circulo2 C3 = new Circulo2("Rojo", "C3");

       // Circulo2.cantCirculo2 = 15;
        System.out.println(Circulo2.cantCirculo2);

    }
}