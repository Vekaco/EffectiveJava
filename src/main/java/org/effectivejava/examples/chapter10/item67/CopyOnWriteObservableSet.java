package org.effectivejava.examples.chapter10.item67;

import org.effectivejava.examples.chapter04.item16.ForwardingSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

//broken - invokes alien method from synchronized block!
public class CopyOnWriteObservableSet<E> extends ForwardingSet<E> {

    public CopyOnWriteObservableSet(Set<E> s) {
        super(s);
    }

    //thread-safe observable set with CopyOnWriteArrayList
    private final List<SetObserver<E>> observers = new CopyOnWriteArrayList<SetObserver<E>>();

    public void addObserver(SetObserver<E> observer) {
        synchronized (observers) {
            observers.add(observer);
        }
    }

    public boolean removeObserver(SetObserver<E> observer) {
        synchronized (observers) {
            return observers.remove(observer);
        }
    }

//    private void notifyElementAdded(E element) {
//        synchronized (observers){
//            for (SetObserver<E> observer: observers)
//                observer.added(this, element);
//        }
//    }

    //alien method moved outside of synchronized block - open calls
    //通过快找来发送通知
    private void notifyElementAdded(E element) {
        synchronized (observers){
            for (SetObserver<E> observer: observers)
                observer.added(this, element);
        }
    }

    @Override
    public boolean add(E e) {
        boolean added = super.add(e);
        if(added)
            notifyElementAdded(e);
        return added;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for (E element: c) {
            result |= add(element);//call notifyElementAdded;
        }
        return result;
    }

}
