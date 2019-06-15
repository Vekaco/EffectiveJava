package org.effectivejava.examples.chapter02.item01;

import java.util.HashMap;

public class HashMapFactory extends HashMap {
    //根据类型推导创建对象
    public static <K, V> HashMap<K,V> newInstance(){
        return new HashMap<K,V>();
    }

    public static void main(String[] args) {
       HashMap<String, String> map = HashMapFactory.newInstance();
       map.put("s1","s1");
    }
}
