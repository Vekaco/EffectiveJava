package org.effectivejava.examples.chapter04.item19;

//用与常量相关的类/接口来导出常量，能用枚举的用枚举，或者用工具类来导出
public class PhysicalConstants2 {
    //prevents instantiation
    private PhysicalConstants2(){}
    public static final double AVOGADROD_NUMBER = 6.02214199e23;
    public static final double DOLTZMANN_CONSTANT = 1.380653e-23;
    public static final double ELECTRON_MASS = 9.10938188e-31;
}
