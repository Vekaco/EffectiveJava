package org.effectivejava.examples.chapter06.item30;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class OperationTest {
    @Test
    public void testStringOperation() {
        double x = 1.22;
        double y = 2.44;
        for (StringOperation op : StringOperation.values())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }


}
