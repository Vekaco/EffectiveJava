package org.effectivejava.examples.chapter04.item20;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Figure2Test {

    @Test
    public void circle() {
        Circle circle = new Circle(0.400);
        assertEquals(Math.PI * 0.400 * 0.400, circle.area(), 0);
    }

    @Test
    public void rectangle() {
        Rectangle rectangle = new Rectangle(1.00, 2.00);
        assertEquals(1.00 * 2.00, rectangle.area(), 0);
    }

    @Test
    public void square() {
        Square square = new Square(0.500);
        assertEquals(0.500 * 0.500, square.area(), 0);
    }
}
