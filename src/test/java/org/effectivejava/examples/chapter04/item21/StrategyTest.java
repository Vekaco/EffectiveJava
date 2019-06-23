package org.effectivejava.examples.chapter04.item21;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrategyTest {
    @Test
    public void testStrategy() {
        assertEquals(3,Host.STRING_LENGTH_COMPARATOR.compare("string","str"));
    }
}
