package org.effectivejava.examples.chapter08.item51;

import org.junit.Test;

public class Item51Test {

    @Test
    public void testStringBuilderConcatenation(){
        Item51 item51 = new Item51();
        item51.statement2();//StringBuilder改善拼接性能
    }
    @Test
    public void testStringConcatenation(){
        Item51 item51 = new Item51();
        item51.statement();//如果数量级巨大，则会有很严重的性能问题
    }
}
