package org.effectivejava.examples.chapter08.item52;

import java.util.List;
import java.util.Vector;

public class Item52 {
    //Good - uses interface as type
    List<Subscriber> subscribers = new Vector<Subscriber>();

    //Bad - uses class as type!!!
    Vector<Subscriber> subscribers2 = new Vector<Subscriber>();

    class Subscriber{}
}
