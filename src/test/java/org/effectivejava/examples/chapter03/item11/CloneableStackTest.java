package org.effectivejava.examples.chapter03.item11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CloneableStackTest {
    @Test
    public void testDeepClone() {
        DeepCloneableStack stack = new DeepCloneableStack();
        stack.push(1);
        stack.push(2);

        DeepCloneableStack clonedStack = stack.clone();

        assertEquals(2, clonedStack.pop());
        assertEquals(1, clonedStack.pop());
        assertEquals(0, clonedStack.getSize());

        //互不影响
        assertEquals(2, stack.getSize());
        assertEquals(2, stack.pop());
        assertEquals(1,stack.pop());

    }

    @Test
    public void testLightClone() {
        LightCloneableStack stack = new LightCloneableStack();
        stack.push(1);
        stack.push(2);

        LightCloneableStack clonedStack = stack.clone();

        assertEquals(2, clonedStack.pop());
        assertEquals(1, clonedStack.pop());
        assertEquals(null, stack.pop());

    }

}
