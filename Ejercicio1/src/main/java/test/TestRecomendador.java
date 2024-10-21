package test;

import org.example.SRP.BBDD;
import org.example.SRP.ExportadorCSV;
import org.example.SRP.Pelicula;
import org.example.SRP.Recomendador;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestRecomendador {

    @Test
    public void test() {
        Recomendador r = new Recomendador();

        List<Pelicula> recomenaciones = r.recomendaciones(BBDD.JUAN);

        Assert.assertFalse(recomenaciones.contains(BBDD.ET));
    }

    @Test
    public void test_formato() {
        Recomendador r = new Recomendador();

        String csv = new ExportadorCSV().exporta(r.recomendaciones(BBDD.JUAN));

        String esperado = "Salvar al soldado Ryan,Spielberg,belico";

        Assert.assertEquals(esperado, csv);

    }
}
