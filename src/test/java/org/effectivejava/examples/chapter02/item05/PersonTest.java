package org.effectivejava.examples.chapter02.item05;

import org.junit.Test;

import java.util.Date;

//两者性能上的差距比较
public class PersonTest {

    @Test
    public void testPerson() {
        long start = System.currentTimeMillis();

        for(int idx = 0; idx <2000; idx++) {
            Person p = new Person(new Date());
            p.isBabyBoomer();
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    @Test
    public void testOptimizedPerson() {
        long start = System.currentTimeMillis();

        for(int idx = 0; idx <2000; idx++) {
            OptimizedPerson p = new OptimizedPerson(new Date());
            p.isBabyBoomer();
        }

        long end = System.currentTimeMillis();


        System.out.println(end - start);
    }
}
