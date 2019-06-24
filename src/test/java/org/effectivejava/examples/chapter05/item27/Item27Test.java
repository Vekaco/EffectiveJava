package org.effectivejava.examples.chapter05.item27;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Item27Test {
    @Test
    public void test() {
        Set<String> guys = new HashSet<String>(Arrays.asList("Tom", "Dick", "Harry"));
        Set<String> stooges = new HashSet<String>(Arrays.asList("Larry", "Moe", "Curly"));
        Set<String> aflCio = Item27.union(guys, stooges);
        System.out.println(aflCio);
    }
}
