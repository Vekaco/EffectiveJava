package org.effectivejava.examples.chapter04.item18;

import java.util.Map;

//骨架实现类:模拟多重继承
public abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {
    private static boolean equals(Object o1, Object o2) {
        return o1 == null ? o2 == null : o1.equals(o2);
    }

    //Primitive operations
    public abstract K getKey();

    public abstract V getValue();
    //implements the general contract of Map.Entry.equals

    //Entries in modifiable maps must override this method
    public V setValue(V value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Map.Entry))
            return false;
        Map.Entry<?, ?> arg = (Map.Entry) obj;
        return equals(getKey() == arg.getKey()) && equals(getValue(), arg.getValue());
    }

    @Override
    public int hashCode() {
        return hashCode(getKey()) ^ hashCode(getValue());
    }

    private static int hashCode(Object obj) {
        return obj == null?0:obj.hashCode();
    }
}
