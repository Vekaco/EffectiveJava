package org.effectivejava.examples.chapter04.item20;

public class Rectangle implements Figure2 {
    final double length;
    final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return length * width;
    }
}
