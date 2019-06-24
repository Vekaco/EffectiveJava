package org.effectivejava.examples.chapter06.item30;

//enum type with constant-specific class bodies and data
public enum StringOperation {
    PLUS("+") {
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        double apply(double x, double y) {
            return x / y;
        }
    };
    private final String operation;
    StringOperation(String operation){
        this.operation = operation;
    }

    @Override
    public String toString() {
       return operation;
    }

    abstract double apply(double x, double y);

}
