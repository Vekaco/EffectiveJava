package org.effectivejava.examples.chapter06.item36;

public class Bigram2 {
    private final char first;
    private final char second;

    public Bigram2(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {

        return o instanceof Bigram2 ? ((Bigram2)o).first == first && ((Bigram2)o).second == second : false;
    }

    public int hashCode() {
        return 31 * first + second;
    }

}
