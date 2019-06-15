package org.effectivejava.examples.chapter02.item03;

// Singleton with public final field
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    //能保证唯一实例，⚠️但可以被AccessibleObject.setAccessible()通过反射机制调用
    private Elvis() { }

    public void leaveTheBuilding(){

    }


}
