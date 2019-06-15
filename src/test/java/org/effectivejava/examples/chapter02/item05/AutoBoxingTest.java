package org.effectivejava.examples.chapter02.item05;

import org.junit.Test;

//注意无意识的装箱会影响性能
public class AutoBoxingTest {
    @Test
    public void autoboxing() {
        long start = System.currentTimeMillis();

        Long sum = 0L;
        for(long idx = 0; idx < Integer.MAX_VALUE; idx ++) {
            sum+=idx;
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @Test
    public void withoutAutoboxing() {
        long start = System.currentTimeMillis();

        long sum = 0L;
        for(long idx = 0; idx < Integer.MAX_VALUE; idx ++) {
            sum += idx;
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
