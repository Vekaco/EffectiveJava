package org.effectivejava.examples.chapter08.item53;

import java.util.Arrays;
import java.util.Set;

/**
 * usage: java.util.TreeSet Hello 5 2 world 1 abc 7
 */
public class Item53 {
    //Reflective instantiation with interface access.
    public static void main(String[] args) {
        //Translate the class name into a Class object.
        Class<?> cl = null;
        try {
            cl = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found!");
            System.exit(1);
        }

        //Instantiate the class
        Set<String> s = null;
        try {
            s = (Set<String>)cl.newInstance();
        } catch (InstantiationException e) {
            System.err.println("Class not accessible!");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.err.println("Class not instantiable!");
            System.exit(1);
        }
        //exercise the set
        s.addAll(Arrays.asList(args).subList(1,args.length));
        System.out.println(s);

    }
}
