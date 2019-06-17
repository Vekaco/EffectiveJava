package org.effectivejava.examples.chapter04.item13;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Item13Test {
    @Test
    public void testArray() {
        assertEquals("s1", Item13.VALUES[0]);
        Item13.VALUES[0] = "changed";
        assertEquals("changed", Item13.VALUES[0]);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testList() {
        assertEquals("s1", Item13.VALUES2.get(0));
        Item13.VALUES2.set(0, "changed");
        assertEquals("changed", Item13.VALUES2.get(0));
    }

    @Test
    public void testClone() {
        assertEquals("s1", Item13.values()[0]);
        Item13.values()[0] = "changed";
        assertNotEquals("changed", Item13.values()[0]);
    }

}
