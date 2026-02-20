package com.example;

public class Estudiante {

    // Atributos privados
    private String nombre;
    private int edad;
    private double promedio;

    // 1️⃣ Constructor vacío
    public Estudiante() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.promedio = 0.0;
    }

    // 1️⃣ Constructor completo
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        setEdad(edad);  // Validación aquí
        this.promedio = promedio;
    }

    // 2️⃣ Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Validación solicitada
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // 3️⃣ Método haAprobado
    public boolean haAprobado() {
        return promedio >= 3.0;
    }

    // 4️⃣ Método mostrarInfo
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);

        if (haAprobado()) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}