package org.effectivejava.examples.chapter05.item26;

import java.util.Arrays;
import java.util.EmptyStackException;

//用泛型重写item06中的栈
public class Stack<E> {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    //修改方案2
    private Object[] elements;
    private int size;

    public Stack() {
        //不可创建不可具体化类型的数组
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
        //修改方案1
        //elements = (E[])new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        E result = (E) elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public boolean isEmpty() {
        return size > 0 ? false : true;
    }
}
