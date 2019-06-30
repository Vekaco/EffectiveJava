package org.effectivejava.examples.chapter08.item49;

import org.effectivejava.examples.chapter04.item21.Comparator;

public class Item49 {
    Comparator<Integer> naturalOrder = new Comparator<Integer>() {
        @Override
        public int compare(Integer first, Integer second) {
            return first < second ? -1 : first == second ? 0 : 1;//here == will not auto-unboxing.
        }
    };

    //use local variable to auto-unboxing
    Comparator<Integer> rightNaturalOrder = new Comparator<Integer>() {
        @Override
        public int compare(Integer first, Integer second) {
            int f = first;//auto-unboxing
            int s = second;//auto-unboxing;
            return f < s ? -1 : f == s ? 0 : 1;
        }
    };

}
