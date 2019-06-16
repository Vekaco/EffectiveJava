package org.effectivejava.examples.chapter03.item12;

import java.util.Comparator;

public class Person2Comparator implements Comparator<Person2> {
    @Override
    public int compare(Person2 p1, Person2 p2) {
        return p1.getAge() - p2.getAge();
    }
}
