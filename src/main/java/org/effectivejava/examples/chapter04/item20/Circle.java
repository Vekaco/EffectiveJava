package org.effectivejava.examples.chapter04.item20;

public class Circle implements Figure2 {
    final double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
