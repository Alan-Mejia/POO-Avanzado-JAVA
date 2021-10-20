package com.alan.banco;

import java.util.Scanner;

public class Banco {
    private String propietario;
    private String clabe;
    private double saldo;

    public Banco(String propietario, String clabe, double saldo){
        this.propietario= propietario;
        this.clabe=clabe;
        this.saldo=saldo;
    }

    public void imprimir(){
        System.out.println(this.propietario);
        System.out.println(this.clabe);
        System.out.println(this.saldo);
    }

}
