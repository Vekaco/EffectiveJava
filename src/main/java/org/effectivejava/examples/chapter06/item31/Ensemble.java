package org.effectivejava.examples.chapter06.item31;

//Abuse of ordinal to derive an associated value - DON'T DO THIS!!!
public enum Ensemble {
    SOLO, DUET, TRIO, QUARTET, QUINTET, SEXTET, SEPTET, OCTET, NONET, DECTET;

    //DON'T DO THIS!!!无法正确和有效的绑定枚举实例
    public int numberOfMusicians() {
        return ordinal() + 1;
    }
}
