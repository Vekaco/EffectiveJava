package org.effectivejava.examples.chapter11.item75;

import java.io.Serializable;


//awful candidate for default serialized form
public class StringList implements Serializable {
    private int size = 0;
    private Entry head = null;
    private static class Entry implements Serializable {
        String data;
        Entry next;
        Entry previous;
    }
    //...remainder omitted
}
