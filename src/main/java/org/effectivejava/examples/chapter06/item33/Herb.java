package org.effectivejava.examples.chapter06.item33;

public class Herb {
    public enum Type {
        ANNUAL, PERENNIAL, BIENNIAL
    }

    private final String name;
    public final Type type;

    Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }
}
