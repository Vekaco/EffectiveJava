package org.effectivejava.examples.chapter04.item16;

import java.util.Collection;
import java.util.Set;

//包装类
public class InstrumentedHashSet2<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public InstrumentedHashSet2(Set s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}

