package com.example;

public class Libro {

    private String titulo;
    private String autor;
    private int paginas;

    // Constructor vacío
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.paginas = 0;
    }

    // Constructor con título y autor
    public Libro(String titulo, String autor) {
        this(titulo, autor, 0);
    }

    // Constructor completo con validación
    public Libro(String titulo, String autor, int paginas) {

        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío");
        }

        if (autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío");
        }

        if (paginas < 0) {
            throw new IllegalArgumentException("Las páginas no pueden ser negativas");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // ===== GETTERS =====

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    // Método para mostrar información
    public void mostrarDetalles() {
        System.out.println("Libro: " + titulo +
                           " | Autor: " + autor +
                           " | Páginas: " + paginas);
    }
}