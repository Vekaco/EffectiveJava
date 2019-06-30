package org.effectivejava.examples.chapter08.item47;

import org.junit.Test;

public class Item47Test {

    @Test
    public void awfulRandom(){
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i = 0; i < 1000000; i++) {
            if (Item47.random(n) < n / 2)
                low++;
            System.out.println(low);
        }
    }

    @Test
    public void effectiveRandom() {
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i = 0; i < 1000000; i++) {
            if (Item47.effectiveRandom(n) < n / 2)
                low++;
            System.out.println(low);
        }
    }
}
