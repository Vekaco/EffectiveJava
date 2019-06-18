package org.effectivejava.examples.chapter04.item17;

import org.junit.Test;

public class SubTest {
    @Test
    public void testSub() {
        //在初始化父类时，会调用到子类的复写方法，导致date为null；
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
