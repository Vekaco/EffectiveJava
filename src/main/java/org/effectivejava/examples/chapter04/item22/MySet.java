package org.effectivejava.examples.chapter04.item22;

import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;

public class MySet<E> extends AbstractSet<E> {
    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    @Override
    public int size() {
        return this.size();
    }

    //具体实现的迭代器，内部类
    private class MyIterator<E> implements  Iterator<E> {

        @Override
        public boolean hasNext() {
            //局部类
            new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return 0;
                }
            };
            return false;
        }

        @Override
        public E next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
}
