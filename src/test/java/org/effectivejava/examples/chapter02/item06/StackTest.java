package org.effectivejava.examples.chapter02.item06;

import org.junit.Test;

public class StackTest {

    @Test
    public void memoryUsingStack() {
        System.out.println("存在内存泄漏风险的Stack...");
        Runtime rt = Runtime.getRuntime();
        long init = rt.totalMemory() - rt.freeMemory();
        System.out.println("初始态-->内存使用：" + init);

        Stack stack = new Stack();
        for (int idx = 0; idx < 1000000; idx++) {
            stack.push(new Object());
        }
        long pushed = rt.totalMemory() - rt.freeMemory();
        System.out.println("push-->内存使用：" + pushed);


        while (stack.getSize() > 0) {
            stack.pop();
        }
        System.gc();
        long pop = rt.totalMemory() - rt.freeMemory();
        System.out.println("pop-->内存使用：" + pop);

        System.out.println("report:合集回收内存-->" + (pushed - pop));

    }

    @Test
    public void memoryUsingOptimizedStack() {
        System.out.println("优化内存后的Stack...");
        Runtime rt = Runtime.getRuntime();
        long init = rt.totalMemory() - rt.freeMemory();
        System.out.println("初始态-->内存使用：" + init);

        OptimizedStack stack = new OptimizedStack();
        for (int idx = 0; idx < 1000000; idx++) {
            stack.push(new Object());
        }
        long pushed = rt.totalMemory() - rt.freeMemory();
        System.out.println("push-->内存使用：" + pushed);


        while (stack.getSize() > 0) {
            stack.pop();
        }
        System.gc();
        long pop = rt.totalMemory() - rt.freeMemory();
        System.out.println("pop-->内存使用：" + pop);

        System.out.println("report:合集回收内存-->" + (pushed - pop));

    }
}
