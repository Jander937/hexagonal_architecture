package org.example.OCP.Manera1;

import org.example.OCP.Manera1.GeneradorPrimos;

import java.util.Comparator;

public class GeneradorPrimosOrdenInverso extends GeneradorPrimos {

    protected Comparator <Integer> getOrdenacion(){
        return (a, b) -> a > b ? -1: 1;
    }
}
