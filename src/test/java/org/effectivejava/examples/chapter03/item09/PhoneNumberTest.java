package org.effectivejava.examples.chapter03.item09;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class PhoneNumberTest {

    private PhoneNumber phoneNumber1;
    private PhoneNumber phoneNumber2;

    @Before
    public void init() {
        phoneNumber1 = new PhoneNumber(111,111,111);
        phoneNumber2 = new PhoneNumber(111,111,111);
    }

    @Test
    public void mapObject(){
        assertEquals(true, phoneNumber1.equals(phoneNumber2));
        HashMap map = new HashMap();
        map.put(phoneNumber1, "Jenny");
        assertEquals("Jenny", map.get(phoneNumber2));
    }
}
