package org.effectivejava.examples.chapter02.item06;

import java.util.Arrays;
import java.util.EmptyStackException;

public class OptimizedStack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public OptimizedStack() {
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
        //每次pop出对象后，将elements中该位置引用设置为过期即可被垃圾回收
        Object objects = elements[--size];
        elements[size] = null;
        return objects;
    }
    private void ensureCapacity() {
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
    public int getSize() {
        return size;
    }
}
