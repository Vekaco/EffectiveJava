package org.effectivejava.examples.chapter06.item31;

import org.junit.Test;

public class OptimizedEnsembleTest {
    @Test
    public void testOptimizedEnsemble() {
        for (OptimizedEnsemble ensemble: OptimizedEnsemble.values())
            System.out.printf("%s has %d musician(s)%n", ensemble,ensemble.numberOfMusicians());
    }
}
