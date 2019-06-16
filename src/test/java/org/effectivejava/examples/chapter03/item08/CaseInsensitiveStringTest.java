package org.effectivejava.examples.chapter03.item08;

import org.effectivejava.examples.chapter03.item08.CaseInsensitiveString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaseInsensitiveStringTest {
    private CaseInsensitiveString cis;
    private CaseInsensitiveString s;
    @Before
    public void init(){
        cis = new CaseInsensitiveString("Polish");
        s = new CaseInsensitiveString("polish");
    }

    @Test
    public void testSymmetry(){
        assertEquals(true, cis.equals(s));
        assertEquals(true, s.equals(cis));
    }
}
