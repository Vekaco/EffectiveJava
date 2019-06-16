package org.effectivejava.examples.chapter02.item06;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(Object e) {
        ensureCapacity();
        elements[size++]=e;
    }

    public Object pop() {
        if(size == 0) {
            throw new EmptyStackException();
        }
        //existing risk of memory leaking. 尽管pop出来的对象无法在elements中访问到，但是这部分过期引用依旧在内存中无法被垃圾回收
        return elements[--size];
    }
    private void ensureCapacity() {
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public int getSize(){
        return size;
    }
}
