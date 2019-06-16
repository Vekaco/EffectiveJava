package org.effectivejava.examples.chapter03.item11;

import java.util.Arrays;
import java.util.EmptyStackException;

public class LightCloneableStack implements Cloneable{
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public LightCloneableStack() {
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


    @Override
    protected LightCloneableStack clone() {
        try {
            return (LightCloneableStack) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
