package com.example;

public class CuentaBancaria {

    // Atributos privados
    private String titular;
    private double saldo;

    // 1️⃣ Constructor con validación
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;

        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    // 2️⃣ Getter y Setter de titular
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // 2️⃣ Getter de saldo (SIN setter)
    public double getSaldo() {
        return saldo;
    }

    // 3️⃣ Método depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    // 4️⃣ Método retirar
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
}
