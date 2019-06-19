package org.effectivejava.examples.chapter04.item20;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FigureTest {
    @Test
    public void circle() {
        Figure circle = new Figure(0.400);
        assertEquals(Math.PI * 0.400 * 0.400, circle.area(),0);
    }

    @Test
    public void rectangle() {
        Figure rectangle = new Figure(1.00,2.00);
        assertEquals(1.00*2.00, rectangle.area(),0);
    }
}
