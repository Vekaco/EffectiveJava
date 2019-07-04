package org.effectivejava.examples.chapter11.item75;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//StringList with a reasonable custom serialized form
public class OptimizedStringList implements Serializable {
    private static final long serialVersionUID = 11111L;
    private transient int size=0;//transient will ignore the field to serializable
    private transient Entry head = null;
    //no longer serializable
    private static class Entry{
        String data;
        Entry next;
        Entry previous;
    }
    //appends the specified string to the list
    public final void add(String s) {
        //...
    }

    /**
     * Serialize this {@code StringList} instance
     * @serialData the size of the list (the number of strings it contains) is emitted({@code int}, followed by all of its elements(each a {@code String}, in th proper sequence
     */
    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeInt(size);
        //write out all elements in the proper order.
        for (Entry e=head; e!= null;e=e.next){
            s.writeObject(e.data);
        }
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        int namElements = s.readInt();
        //read in all elements and insert then in list
        for (int i=0;i<namElements;i++) {
            add((String) s.readObject());
        }

    }

    //writeObject for synchronized class with default serialized form
//    private synchronized void writeObject(ObjectOutputStream s) throws IOException {
//        s.defaultWriteObject();
//    }
}
