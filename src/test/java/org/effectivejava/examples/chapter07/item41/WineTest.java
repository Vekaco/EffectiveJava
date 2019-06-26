package org.effectivejava.examples.chapter07.item41;

import org.junit.Test;

public class WineTest {

    @Test
    public void testWine() {
        Wine[] wines = {new Wine(), new SparklingWine(), new Champagne()};
        for (Wine wine: wines) {
            System.out.println(wine.name());
        }
    }
}
