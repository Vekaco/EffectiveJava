package org.effectivejava.examples.chapter10.item69;

public class ObjectWait {
    //the standard idiom for using the wait method
    private final static Object lock = new Object();
    private static int capability = 5;
    private static int size = 0;

    public static void put() throws InterruptedException {
        synchronized (lock) {
            size++;
            if (size > 0) {
                lock.notifyAll();
            }
            while (size >= capability) {
                lock.wait();//release lock and reacquires on wakeup
                System.out.printf("size is %d after put%n", size);
            }
        }
        //perform action appropriate to condition
    }


    public static void get() throws InterruptedException {
        synchronized (lock) {
            size--;
            if (size < capability) {
                lock.notifyAll();
            }
            while (size <= 0) {
                lock.wait();//release lock and reacquires on wakeup
                System.out.printf("size is %d after get%n", size);
            }

        }
        //perform action appropriate to condition
    }

    public static void main(String[] args) {
        final Runnable put = new Runnable() {
            @Override
            public void run() {
                try {
                    put();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        final Runnable get = new Runnable() {
            @Override
            public void run() {
                try {
                    get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        for (int i=0; i<100; i++) {
            Thread puts = new Thread(put);
            Thread gets = new Thread(get);
            puts.start();
            gets.start();
        }
    }
}
