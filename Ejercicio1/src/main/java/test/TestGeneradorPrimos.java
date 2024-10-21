package test;

import org.example.OCP.Manera1.GeneradorPrimos;
import org.example.OCP.Manera1.GeneradorPrimosOrdenInverso;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class TestGeneradorPrimos {
    @Test
    public void test_orden_natural(){
        GeneradorPrimos generadorPrimos = new GeneradorPrimos();
        List<Integer> expected = Arrays.asList(2,3,5,7,11,13);

        Assert.assertThat(generadorPrimos.primos(15), is(expected));
    }
    @Test
    public void test_orden_inverso(){
        GeneradorPrimos generadorPrimos = new GeneradorPrimosOrdenInverso();
        List<Integer> expected = Arrays.asList(13,11,7,5,3,2);

        Assert.assertThat(generadorPrimos.primos(15), is(expected));
    }
}
