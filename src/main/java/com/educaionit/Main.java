package com.educaionit;

import com.educaionit.encapsulamiento.CuentaBancaria;
import com.educaionit.herencia.ClaseA;
import com.educaionit.herencia.ClaseB;
import com.educaionit.herencia.ClaseC;

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

    }
}