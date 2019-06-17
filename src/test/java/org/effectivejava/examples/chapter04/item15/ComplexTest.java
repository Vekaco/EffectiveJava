package org.effectivejava.examples.chapter04.item15;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {

    private Complex c1;
    private Complex c2;

    @Before
    public void initComplex(){
        c1 = new Complex(1,1);
        c2 = new Complex(2,2);
    }

    @Test
    public void testAdd() {
        assertEquals(new Complex(3,3), c1.add(c2));
    }

    @Test
    public void testSubtract() {
        assertEquals(new Complex(-1, -1), c1.subtract(c2));
    }

    @Test
    public void testMultiply() {
        assertEquals(new Complex(0, 4), c1.multiply(c2) );
    }
    @Test
    public void testDivide() {
        assertEquals(new Complex(0.5,0), c1.divide(c2));
    }
}
