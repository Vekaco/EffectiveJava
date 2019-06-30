package org.effectivejava.examples.chapter08.item50;

//Broken - inappropriate use of string as capability! 字符串不适合代替能力表
public class ThreadLocal {
    private ThreadLocal(){}//non-instantiable
    //set the current thread's value for the named variable.
    public static void set(String key, Object value){}//必须保证字符串唯一
    //return the current thread's value for the named variable
    public static Object get(String key) { return "";}

}
