package org.effectivejava.examples.chapter04.item14;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeTest {

    @Test
    public void validTest(){
        Time time = new Time(2,30);
        assertEquals(2, time.hour);
        assertEquals(30, time.minute);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidTest() {
        Time time = new Time(2,60);
    }
}
