package org.effectivejava.examples.chapter03.item12;

import org.junit.Test;

import java.util.Arrays;

public class Person2Test {
    @Test
    public void testComparator() {
        Person2 p1 = new Person2(12);
        Person2 p2 = new Person2(18);
        Person2 p3 = new Person2(9);

        Person2Comparator person2Comparator = new Person2Comparator();

        Person2[] person2s = {p1,p2,p3};
        Arrays.sort(person2s, person2Comparator);
        System.out.println("" + person2s[0] + person2s[1] + person2s[2]);

    }
}
