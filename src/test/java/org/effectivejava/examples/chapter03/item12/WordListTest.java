package org.effectivejava.examples.chapter03.item12;

import org.junit.Test;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class WordListTest {
    @Test
    public void testSortString() {
        String[] args = new String[]{"a", "b", "0", "z","c"};
        Set<String> s = new TreeSet<String>();
        Collections.addAll(s, args);
        System.out.println(s);
    }
}
