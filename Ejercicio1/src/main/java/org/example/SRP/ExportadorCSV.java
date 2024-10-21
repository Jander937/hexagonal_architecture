package org.example.SRP;

import java.util.List;
import java.util.stream.Collectors;

public class ExportadorCSV {
    public ExportadorCSV() {
    }

    public String exporta (List<Pelicula> peliculas){
        return peliculas.stream()
                .map(p -> (p.getTitulo() + "," + p.getDirector() +"," + p.getGenero() + "," ))
                .collect(Collectors.joining("\n"));
    }
}
