package org.effectivejava.examples.chapter02.item03;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Elvis2Test {

    @Test
    public void test() {
        Elvis2 elvis = Elvis2.getInstance();
        Elvis2 elvis2 = Elvis2.getInstance();

        assertEquals(elvis, elvis2);
    }

    @Test
    public void testReflect() throws IllegalAccessException, InvocationTargetException, InstantiationException {
        //通过反射机制调用私有构造方法创建新的对象
        Elvis2 elvis = Elvis2.getInstance();
        Class<?> clz = elvis.getClass();
        Constructor[] constructors = clz.getDeclaredConstructors();
        AccessibleObject.setAccessible(constructors, true);
        Elvis2 elvis2s = (Elvis2) constructors[0].newInstance();
        assertNotEquals(elvis2s, elvis);
    }

    @Test
    public void testSeriable() throws IOException, ClassNotFoundException {
        Elvis2 elvis2 = Elvis2.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("./elvis2.txt")));
        objectOutputStream.writeObject(elvis2);
        objectOutputStream.close();
        System.out.println("--->序列化完成");

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("./elvis2.txt")));
        Elvis2  elvis2_resolved = (Elvis2) objectInputStream.readObject();

        assertEquals(elvis2, elvis2_resolved);

    }
}
