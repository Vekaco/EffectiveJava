package org.effectivejava.examples.chapter08.item50;

public class EffectiveThreadLocal {

    private EffectiveThreadLocal(){}//non-instantiable
    public static class Key{ //capability
        Key(){}
    }
    //generates a unique, un-forgeable key
    public static Key getKey(){
        return new Key();
    }
    public static void set(Key key, Object value){}
    public static Object get(Key key) {
        return "";
    }
}
