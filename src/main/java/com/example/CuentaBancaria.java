package com.example;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {

        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("El titular no puede estar vacío");
        }

        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }

        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // ===== GETTERS =====
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // ===== MÉTODOS =====
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser mayor que 0");
        }

        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser mayor que 0");
        }

        if (monto > saldo) {
            throw new IllegalArgumentException("Fondos insuficientes");
        }

        saldo -= monto;
    }

    public void mostrarDetalles() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}