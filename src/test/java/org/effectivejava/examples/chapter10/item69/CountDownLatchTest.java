package org.effectivejava.examples.chapter10.item69;


import org.junit.Test;

import java.util.concurrent.Executors;

public class CountDownLatchTest {
    @Test
    public void testCountDownLatch() throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() +  " is running...");
            }
        };

        long time = CountDownLatchDemo.time(Executors.newCachedThreadPool(),10,runnable);
        System.out.printf("%d nanos needed to completed all tasks", time);
    }
}
