package org.effectivejava.examples.chapter10.item66;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

//cooperative thread termination with a volatile field.
public class VolatileStopThread {
    private static volatile boolean stopRequested;
    //broken- requires synchronization!
    private static volatile int nextSerialNumber =0;//volatile保证可见性 但不保证互斥性.当方法调用中已经同步，则可以删除volatile修饰符

    //更为合适的是使用原子类
    private static final AtomicLong nextSerialNum = new AtomicLong();

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while (!stopRequested)
                    i++;
            }
        });

        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }

    public synchronized static int generateSerialNumber(){
        return nextSerialNumber++;//++不是原子操作
    }
    public static long getNextSerialNum() {
        return nextSerialNum.getAndIncrement();//保证原子操作
    }
}
