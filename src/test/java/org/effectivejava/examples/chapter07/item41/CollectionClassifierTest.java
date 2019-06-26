package org.effectivejava.examples.chapter07.item41;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionClassifierTest {

    @Test
    public void testCollectionClassifier() {
        Collection<?>[] collections = {new HashSet<String>(), new ArrayList<String>(), new HashMap<String, String>().values()};

        for (Collection<?> c : collections) {
            System.out.println(CollectionClassifier.classify(c));
        }
    }

    @Test
    public void testRepairedCollectionClassifier() {
        Collection<?>[] collections = {new HashSet<String>(), new ArrayList<String>(), new HashMap<String, String>().values()};

        for (Collection<?> c : collections) {
            System.out.println(RepairedCollectionClassifier.classify(c));
        }
    }
}
