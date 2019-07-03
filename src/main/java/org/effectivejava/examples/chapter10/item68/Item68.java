package org.effectivejava.examples.chapter10.item68;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.*;

public class Item68 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("running...");
            }
        };
        executor.execute(runnable);
        executor.shutdown();
    }
}
