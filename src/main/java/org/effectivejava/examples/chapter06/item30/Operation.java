package org.effectivejava.examples.chapter06.item30;

//enum type that siwthces on its own value - questionable
public enum Operation {
    PLUS, MINUS,TIMES,DIVIDE;

    //do the arithmetic op represented by this constant
    //awful!!!
    double apply(double x, double y) {
        switch (this){
            case PLUS: return x + y;
            case MINUS: return x - y;
            case TIMES: return x * y;
            case DIVIDE: return x / y;
        }
        throw new AssertionError("Unknown op:" + this);
    }
}
