package org.effectivejava.examples.chapter05.item23;

import java.util.Set;

public class NumberInCommon {
    //无限通配符类型，如Set<?>读作某个类型的集合
    static int numElementsInCommon(Set<?> s1, Set<?> s2) {
        int result = 0;

        for (Object o1: s1) {
            if(s2.contains(o1)) {
                result ++;
            }
        }
        return result;
    }
}
