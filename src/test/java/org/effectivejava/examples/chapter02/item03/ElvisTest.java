package org.effectivejava.examples.chapter02.item03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElvisTest {

    @Test
    public void singletonTest() {
        Elvis elvis = Elvis.INSTANCE;
        Elvis elvis1 = Elvis.INSTANCE;

        assertEquals(elvis, elvis1);
    }
}
