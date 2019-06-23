package org.effectivejava.examples.chapter05.item23;

import java.util.ArrayList;
import java.util.List;

public class Item23 {
    public static void main(String[] args) {
        List<String> strings= new ArrayList<String>();
        unsafeAdd(strings, new Integer(42));
        String s = strings.get(0);//编译器自动转换类型
    }
    private static void unsafeAdd(List list, Object o){
        list.add(o);
    }
}
