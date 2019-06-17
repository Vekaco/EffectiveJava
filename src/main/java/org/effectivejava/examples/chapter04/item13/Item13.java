package org.effectivejava.examples.chapter04.item13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Item13 {
    //potential security hole! final refer to a changeable object.
    public static final String[] VALUES = {"s1", "s2"};

    // to fix the above. change array to be a private object, and expose a final list object
    private static final String[] PRIVATE_VALUES = {"s1", "s2"};
    public static final List<String> VALUES2 = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    // way2: return a clone of private array.
    public static final String[] values() {
        return PRIVATE_VALUES.clone();
    }

}
