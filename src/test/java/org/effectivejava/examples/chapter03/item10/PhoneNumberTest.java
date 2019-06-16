package org.effectivejava.examples.chapter03.item10;

import org.effectivejava.examples.chapter03.item09.PhoneNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneNumberTest {
    private PhoneNumber phoneNumber;
    @Before
    public void init() {
        phoneNumber = new PhoneNumber(111,111,111);
    }

    @Test
    public void testToString() {
        System.out.println(phoneNumber);
        assertEquals("(111) 111-0111", phoneNumber.toString());
    }

}
