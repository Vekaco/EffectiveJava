package org.effectivejava.examples.chapter03.item12;

public class Person implements Comparable<Person>{
    private int age;

    public Person(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Person person) {
        return age - person.age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "age:" + age;
    }
}
