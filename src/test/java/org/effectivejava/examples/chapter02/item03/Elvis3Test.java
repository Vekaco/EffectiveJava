package org.effectivejava.examples.chapter02.item03;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import static org.junit.Assert.assertEquals;

public class Elvis3Test {
    @Test
    public void test() {
        Elvis3 elvis3 = Elvis3.INSTANCE;
        Elvis3 elvis31 = Elvis3.INSTANCE;
        assertEquals(elvis3, elvis31);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReflect() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        //无法通过反射机制来创建枚举类型对象
        Elvis3 elvis3 = Elvis3.INSTANCE;
        Class<?> clz = elvis3.getClass();
        Constructor[] constructors = clz.getDeclaredConstructors();
        constructors[0].setAccessible(true);
        Elvis3 elvis3s = (Elvis3) constructors[0].newInstance();
        assertEquals(elvis3, elvis3s);
    }
}
