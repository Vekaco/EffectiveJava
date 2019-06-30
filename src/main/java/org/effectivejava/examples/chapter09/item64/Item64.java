package org.effectivejava.examples.chapter09.item64;

import java.util.EmptyStackException;

public class Item64 {
    private int size;
    private Object[] elements = new Object[16];
    public Object pop() {
        if(size==0)//如果没有这步原子性判断，size会处于负数状态
        throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] =null;
        return result;
        }
        }
