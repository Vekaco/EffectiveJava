package org.effectivejava.examples.chapter10.item69;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public class CountDownLatchDemo {
    //simple framework for timing concurrent execution.
    public static long time(Executor executor, int concurrency, final Runnable action) throws InterruptedException {

        final CountDownLatch ready = new CountDownLatch(concurrency);
        final CountDownLatch start = new CountDownLatch(1);
        final CountDownLatch done = new CountDownLatch(concurrency);

        for(int i=0;i< concurrency;i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    ready.countDown();//tell timer we're ready
                    try {
                        start.await();//wait till peers are ready
                        action.run();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        done.countDown();
                    }
                }
            });
        }
        ready.await();//wait for all works to be ready
        long startNanos = System.nanoTime();
        start.countDown();//And they're off!
        done.await();//wait for all workers to finish
        return System.nanoTime() - startNanos;
    }
}
