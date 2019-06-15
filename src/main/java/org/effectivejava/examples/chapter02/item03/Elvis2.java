package org.effectivejava.examples.chapter02.item03;

import java.io.Serializable;

// Singleton with static factory
// 实例域瞬时态并且实现Serializable接口，加入readResolve()方法。
public class Elvis2 implements Serializable {
    private static  transient final Elvis2 INSTANCE = new Elvis2();
    private Elvis2() {}

    public static Elvis2 getInstance() {
        return INSTANCE;
    }
    private Object readResolve() {
        return INSTANCE;
    }

}
