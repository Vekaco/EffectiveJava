package org.effectivejava.examples.chapter02.item04;

//non-instantiable utility class
public class UtilityClass {
    // suppress default constructor for non-insatiability
    private UtilityClass() {
        throw new AssertionError();
    }
    // Remainder omitted
}
