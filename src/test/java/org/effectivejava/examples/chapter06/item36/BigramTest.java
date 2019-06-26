package org.effectivejava.examples.chapter06.item36;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class BigramTest {

    @Test
    public void testNotUsingOverride() {
        Set<Bigram> s = new HashSet<Bigram>();
        for(int i=0; i<10;i++) {
            for(char ch='a'; ch<='z';ch++) {
                s.add(new Bigram(ch,ch));
            }
        }
        System.out.println(s.size());
    }

    @Test
    public void testUsingOverride() {
        Set<Bigram2> s = new HashSet<Bigram2>();
        for(int i=0; i<10;i++) {
            for(char ch='a'; ch<='z';ch++) {
                s.add(new Bigram2(ch,ch));
            }
        }
        System.out.println(s.size());
    }
}
