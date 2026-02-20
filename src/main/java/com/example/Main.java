package com.example;

public class Main {
    public static void main(String[] args) {

        // ===== LIBROS =====
        Libro l1 = new Libro();
        l1.mostrarDetalles();

        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
        l2.mostrarDetalles();

        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarDetalles();

        // ===== CUENTA BANCARIA =====
        try {
            CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
            cuenta.depositar(200);
            System.out.println(cuenta.getSaldo()); // 700
            cuenta.retirar(1000); // Genera excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error en cuenta bancaria: " + e.getMessage());
        }

        // ===== ESTUDIANTE =====
        try {
            Estudiante e = new Estudiante("Pedro", 21, 2.5);
            e.mostrarInfo();
        } catch (IllegalArgumentException ex) {
            System.out.println("Error en estudiante: " + ex.getMessage());
        }
    }
}