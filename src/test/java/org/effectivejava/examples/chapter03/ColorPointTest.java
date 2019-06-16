package org.effectivejava.examples.chapter03;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class ColorPointTest {

    private Point p1;
    private ColorPoint p2;
    private ColorPoint p3;

    @Before
    public void init() {
        p1 = new Point(1, 2);
        p2 = new ColorPoint(1, 2, Color.RED);
        p3 = new ColorPoint(1,2, Color.BLUE);
    }

    @Test
    public void test() {
        assertEquals(true, p2.equals(p1));
        assertEquals(true, p1.equals(p3));
        //违反传递性
        assertEquals(true, p2.equals(p3));

    }

}
