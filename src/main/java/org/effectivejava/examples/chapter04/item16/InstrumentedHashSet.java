package org.effectivejava.examples.chapter04.item16;

import java.util.Collection;
import java.util.HashSet;

public class InstrumentedHashSet<E> extends HashSet<E>{
    private int addCount = 0;
    public InstrumentedHashSet() {}
    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap,loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean remove(Object o) {
        addCount--;
        return super.remove(o);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        //Broken - Inappropriate use of inheritance!
        addCount+=c.size();
        //由于实际addAll再次调用add添加元素，导致被重复计数
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
