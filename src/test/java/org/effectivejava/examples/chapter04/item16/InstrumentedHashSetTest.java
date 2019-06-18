package org.effectivejava.examples.chapter04.item16;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class InstrumentedHashSetTest {
    // private InstrumentedHashSet instrumentedHashSet;

    @Before
    public void init() {
        //instrumentedHashSet = new InstrumentedHashSet();
    }

    @Test
    public void testAdd() {
        InstrumentedHashSet instrumentedHashSet = new InstrumentedHashSet();
        instrumentedHashSet.add(1);
        instrumentedHashSet.add(2);
        assertEquals(2, instrumentedHashSet.getAddCount());
    }

    @Test(expected = AssertionError.class)
    public void testAddAll() {
        int[] elements = new int[]{2, 3, 4};
        InstrumentedHashSet instrumentedHashSet = new InstrumentedHashSet();
        instrumentedHashSet.addAll(Arrays.asList(elements));
        assertEquals(3, instrumentedHashSet.getAddCount());
    }

    @Test
    public void testAdd2() {
        InstrumentedHashSet2 s = new InstrumentedHashSet2<String>(new TreeSet());
        s.add("1");
        s.add("2");
        assertEquals(2, s.getAddCount());
    }

    @Test
    public void testAddAll2() {
        InstrumentedHashSet2 s = new InstrumentedHashSet2<String>(new TreeSet());
        s.addAll(Arrays.asList(new String[]{"2","3","4"}));
        assertEquals(3, s.getAddCount());
    }
}
