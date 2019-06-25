package org.effectivejava.examples.chapter06.item34;

import org.junit.Test;

public class OperationTest {

    private double x = 2.00;
    private double y = 1.00;

    @Test
    public void testBasic() {
        for(Operation op: BasicOperation.class.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n",x,op,y,op.apply(x,y));
        }
    }

    @Test
    public void testExtended() {
        for(Operation op: ExtendedOperation.class.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n",x,op,y,op.apply(x,y));
        }
    }

}
