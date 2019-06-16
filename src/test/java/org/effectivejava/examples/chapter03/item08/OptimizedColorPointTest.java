package org.effectivejava.examples.chapter03.item08;

import org.effectivejava.examples.chapter03.item08.OptimizedColorPoint;
import org.effectivejava.examples.chapter03.item08.Point;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class OptimizedColorPointTest {
    private org.effectivejava.examples.chapter03.item08.Point p1;
    private OptimizedColorPoint p2;
    private OptimizedColorPoint p3;

    @Before
    public void init() {
        p1 = new Point(1, 2);
        p2 = new OptimizedColorPoint(1, 2, Color.RED);
        p3 = new OptimizedColorPoint(1,2, Color.BLUE);
    }

    @Test
    public void test() {
        assertEquals(false, p2.equals(p1));
        assertEquals(false, p1.equals(p3));
        //违反传递性
        assertEquals(false, p2.equals(p3));

    }

}
