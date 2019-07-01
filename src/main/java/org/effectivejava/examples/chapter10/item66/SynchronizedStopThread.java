package org.effectivejava.examples.chapter10.item66;

import java.util.concurrent.TimeUnit;

//properly synchronized cooperative thread termination
public class SynchronizedStopThread {
    private static boolean stopRequested;
    private static synchronized void requestStop() {
        stopRequested = true;
    }
    private static synchronized boolean stopRequested() {
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while (!stopRequested()) {
                    i++;
                }
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }
}
