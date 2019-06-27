package org.effectivejava.examples.chapter07.item44;


/**
 * 泛型、枚举和注解文档
 * An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value
 *
 * @param <K> the type of keys maintained by this map.
 * @param <V> the type of values maintained by this map.
 */
public interface JavadocDemo<K,V> {
    /**
     * Returns the element at the specified position in this list.
     * <p>This method is <i>not</i> guaranteed to run in constant time.
     * In some implementations it may run in time proportional to element position
     * </p>
     *
     * @param index index of element to return; must be non-negative and less than the size of this list
     * @return the element at the specified position in this list
     * throws IndexOutOfBoundsException if the index is out of the range{{@code index<0 || index>=this.size()}}
     * ({@literal <>&})
     */
     V get(K index);

}
