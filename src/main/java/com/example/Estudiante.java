package com.example;

public class Estudiante {

    private String nombre;
    private int edad;
    private double promedio;

    // Constante para la nota mínima de aprobación
    private static final double NOTA_APROBACION = 3.0;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.promedio = 0.0;
    }

    // Constructor con parámetros
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        setEdad(edad);          // Usa la validación del setter
        setPromedio(promedio);  // Usa la validación del setter
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor a 0.");
        }
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }


    public void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 5) {
            throw new IllegalArgumentException("El promedio debe estar entre 0 y 5.");
        }
        this.promedio = promedio;
    }


    public boolean haAprobado() {
        return promedio >= NOTA_APROBACION;
    }


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