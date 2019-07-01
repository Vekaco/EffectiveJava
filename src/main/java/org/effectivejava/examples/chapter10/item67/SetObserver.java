package org.effectivejava.examples.chapter10.item67;

public interface SetObserver<E> {
    //invoked when an element is added to the observable set
    void added(ObservableSet<E> e, E element);
    void added(CopyOnWriteObservableSet<E> e, E element);
}
