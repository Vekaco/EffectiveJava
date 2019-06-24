package org.effectivejava.examples.chapter05.item27;

import java.util.HashSet;
import java.util.Set;

public class Item27 {
//    public static Set union(Set s1, Set s2) {
//        Set result = new HashSet(s1);
//        result.addAll(s2);
//        return result;
//    }

    //泛型方法
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }

}
