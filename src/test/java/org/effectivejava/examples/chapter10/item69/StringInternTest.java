package org.effectivejava.examples.chapter10.item69;

import org.junit.Test;

public class StringInternTest {
    @Test
    public void testIntern() {
        StringIntern.intern("123");
        StringIntern.intern("123");
        StringIntern.intern("123");
        StringIntern.intern("123");
    }

    @Test
    public void testFasterIntern() {
        StringIntern.fasterIntern("123");
        StringIntern.fasterIntern("123");
        StringIntern.fasterIntern("123");
        StringIntern.fasterIntern("123");
    }
}
