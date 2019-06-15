package org.effectivejava.examples.chapter02.item05;

public class Item05 {
    public static void main(String[] args) {
        String s = new String("stringette"); //DON'T DO THIS! 创建多余的String对象

        String x = "stringeetee";//只用了一个String实例

        String y = "stringeetee";

        if(x == y) {
            //由于实例不变性再次调用时也不会在创建对象。
            System.out.println("x == y");
        }
    }
}
