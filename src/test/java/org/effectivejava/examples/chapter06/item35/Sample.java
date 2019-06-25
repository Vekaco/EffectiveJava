package org.effectivejava.examples.chapter06.item35;

//program containing marker annotations
public class Sample {
    @Test public static void m1(){}//test should pass
    public static void m2(){}
    @Test public static void m3() {
        throw new RuntimeException("Boom");
    }
    public static void m4(){}
    @Test public void m5(){}//invalid use:nonstatic method
    public static void m6(){}
    @Test public static void m7(){//test should fail
        throw new RuntimeException("Crash");
    }
    public static void m8(){}
}
