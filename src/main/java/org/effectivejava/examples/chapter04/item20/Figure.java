package org.effectivejava.examples.chapter04.item20;

//tag class - vastly inferior to a class hierarchy!
//DONT DO THIS!!!
class Figure {

    enum Shape {RECTANGLE, CIRCLE}

    //tag field - the shape of this figure
    final Shape shape;

    //these fields are used only if shape is RECTANGLE
    double length;
    double width;

    //this field is used only if shape is CIRCLE
    double radius;

    //constructor for circle
    Figure(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }
    //constructor for rectangle
    Figure(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }
    double area() {
        switch (shape) {
            case CIRCLE:
                return Math.PI * (radius * radius);
            case RECTANGLE:
                return length * width;
                default:
                    throw new AssertionError();
        }

    }

}
