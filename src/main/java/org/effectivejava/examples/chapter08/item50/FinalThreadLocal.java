package org.effectivejava.examples.chapter08.item50;

public final class FinalThreadLocal<T> {
    public FinalThreadLocal(){}
    public void set(T value){}
    public T get(){
        return (T)(new Object());
    }

}
