package org.effectivejava.examples.chapter09.item63;

public class IndexOutOfBoundsException extends Exception{

    private final int lowerBound;
    private final int uppserBound;
    private final int index;
    public IndexOutOfBoundsException(int lowerBound, int upperBound, int index) {
        //generate a detail message that captures the failure
        super("Lower bound:" + lowerBound +", Upper bound:" + upperBound +", Index:"+ index);
        //save failure information for programmatic access;
        this.lowerBound = lowerBound;
        this.uppserBound = upperBound;
        this.index = index;
    }
}
