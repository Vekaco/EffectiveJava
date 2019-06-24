package org.effectivejava.examples.chapter05.item26;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

    String[] args;
    @Before

    public void init() {
        args = new String[]{"1","2","3"};
    }
    @Test
    public void test(){
        Stack<String> stack = new Stack<String>();
        for(String arg: args) {
            stack.push(arg);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toUpperCase());
        }
    }
}
