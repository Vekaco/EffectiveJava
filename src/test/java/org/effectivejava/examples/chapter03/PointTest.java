package org.effectivejava.examples.chapter03;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//传递性
public class PointTest {
    private Point p1;
    private Point p2;
    private Point p3;

    @Before
    public void init() {
        p1 = new Point(1,2);
        p2 = new Point(1,2);
        p3 = new Point(1,2);
    }

    @Test
    public void testTransitivity(){
        assertEquals(p1, p2);
        assertEquals(p2, p3);
        assertEquals(p1, p3);
    }

}
