package org.effectivejava.examples.chapter08.item49;

public class Unbelievable {
    static Integer i;

    public static void main(String[] args) {
        if(i==42) //here i is not initialized, will throw nullpointerexception.
            System.out.println("Unbelievable");
    }
}
