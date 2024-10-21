package org.example.SRP;

public class Pelicula {
    private final String titulo;

    private final String genero;

    private final String director;


    public Pelicula(String titulo, String genero, String director) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getDirector() {
        return director;
    }
}
