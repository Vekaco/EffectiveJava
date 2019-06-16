package org.effectivejava.examples.chapter03.item12;


import org.junit.Test;

import java.util.Arrays;

public class PersonTest {

    @Test
    public void testComparable(){
        Person p1 = new Person(11);
        Person p2 = new Person(22);
        Person p3 = new Person(9);
        Person[] persons = {p1,p2,p3};
        Arrays.sort(persons);
        System.out.println("" + persons[0] +  persons[1] + persons[2]);
    }
}
