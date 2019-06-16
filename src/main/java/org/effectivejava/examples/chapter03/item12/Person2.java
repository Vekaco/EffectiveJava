package org.effectivejava.examples.chapter03.item12;


public class Person2 {
    private int age;

    public Person2(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "age:" + age;
    }
}
