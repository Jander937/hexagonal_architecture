package org.example.SRP;

import java.util.List;

public class Cliente {
    private final String nombre;

    private final List<Pelicula> favoritas;

    public Cliente(String nombre, List<Pelicula> favoritas) {
        this.nombre = nombre;
        this.favoritas = favoritas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pelicula> getFavoritas() {
        return favoritas;
    }
}
