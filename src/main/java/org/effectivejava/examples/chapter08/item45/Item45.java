package org.effectivejava.examples.chapter08.item45;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Item45 {

    public void forEach(Collection<Element> c) {
        //preferred idiom for iterating over a collection
        for(Element e: c) {
            //doSomething(e);
        }

        //before jdk1.5.
        //No for-each loop or generics before release 1.5
        for (Iterator i=c.iterator();i.hasNext();) {
            //doSomething((Element)i.next());
        }

        //慎用while循环

        Iterator<Element> i = c.iterator();

        while (i.hasNext()) {
            //dosomething
        }

        Collection<Element> c2 = new ArrayList<Element>();
        Iterator<Element> i2 = c2.iterator();

        while (i.hasNext()) {//Here BUG!!! intent to use i2, but i actually! no compile error but get empty every time.
            //dosomething
        }
    }
}
