package org.effectivejava.examples.chapter04.item15;

public class Complex2 {
    private double re;
    private double im;
    //私有构造方法
    private Complex2(double re, double im) {
        this.re = re;
        this.im = im;
    }
    //提供静态工厂来实现不可变类
    public static Complex2 valueOf(double re, double im) {
        return new Complex2(re,im);
    }
}
