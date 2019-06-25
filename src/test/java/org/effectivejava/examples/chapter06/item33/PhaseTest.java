package org.effectivejava.examples.chapter06.item33;

import org.junit.Test;

public class PhaseTest {

    @Test
    public void testNotUsingEnumMap() {
        //需要绑定和固定enum类型的位置，当加入新类型时，如果忘记修改相对应的矩阵代码则会出错，且在数据量大时难以灵活适用
        System.out.println(Phase.Transition.from(Phase.GAS, Phase.LIQUID));
    }

    @Test
    public void testUsingEnumMap() {
        System.out.println(EnumMapPhase.Transition.from(EnumMapPhase.GAS, EnumMapPhase.LIQUID));
    }
}
