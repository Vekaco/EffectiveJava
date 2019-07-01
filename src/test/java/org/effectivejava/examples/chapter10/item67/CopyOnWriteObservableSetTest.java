package org.effectivejava.examples.chapter10.item67;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class CopyOnWriteObservableSetTest {
    private CopyOnWriteObservableSet<Integer> set;

    @Before
    public void initSet() {
        set = new CopyOnWriteObservableSet<Integer>(new HashSet<Integer>());
    }

    @Test
    public void testRemoveIf23() {

        set.addObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> e, Integer element) {

            }

            @Override
            public void added(CopyOnWriteObservableSet<Integer> e, Integer element) {
                System.out.println(element);
                if(element==23)
                    e.removeObserver(this);
            }
        });
        for (int i = 0; i < 100; i++)
            set.add(i);
    }


}
