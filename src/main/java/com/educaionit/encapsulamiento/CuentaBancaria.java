package com.educaionit.encapsulamiento;

public class CuentaBancaria {

    private int id;
    private float saldo;
    private String moneda;


    public void depositarDinero(float monto){
        saldo = saldo + monto;

    }

    public void retirarDinero(float monto){
        if(monto < saldo)   saldo = saldo - monto;
    }

    public float obtenerSaldo(){
        return saldo;
    }

    public String obtenerMoneda(){
        return moneda;
    }

    public void setMoneda (String moneda){
        this.moneda = moneda;

    }

}
