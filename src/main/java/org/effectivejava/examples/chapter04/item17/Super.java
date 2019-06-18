package org.effectivejava.examples.chapter04.item17;

public class Super {
    //broken!!! - constructor invokes an overridable method
    public Super() {
        overrideMe();
    }
    public void overrideMe() {

    }
}
