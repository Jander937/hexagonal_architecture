package org.example.SRP;

import org.example.SRP.BBDD;
import org.example.SRP.Cliente;
import org.example.SRP.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Recomendador {
    public List<Pelicula> recomendaciones (Cliente cliente){

        List<Pelicula> recomendadas = new ArrayList<>();

        for (Pelicula favorita: cliente.getFavoritas()){
            recomendadas.addAll(BBDD.PELIS_POR_DIRECTOR.get(favorita.getDirector()));
        }

        recomendadas.removeAll(cliente.getFavoritas());

        return recomendadas;
    }

}
