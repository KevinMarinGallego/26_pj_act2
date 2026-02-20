package com.example;

public class Estudiante {

    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) {

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        setEdad(edad);
        setPromedio(promedio);

        this.nombre = nombre;
    }

    // ===== GETTERS =====
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    // ===== SETTERS CON VALIDACIÓN FUERTE =====
    public void setEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor que 0");
        }
        this.edad = edad;
    }

    public void setPromedio(double promedio) {
        if (promedio < 0.0 || promedio > 5.0) {
            throw new IllegalArgumentException("El promedio debe estar entre 0.0 y 5.0");
        }
        this.promedio = promedio;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);

        if (promedio >= 3.0) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}