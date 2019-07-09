package org.effectivejava.examples.chapter11.item77;

import java.io.Serializable;

public class ElvisStealer implements Serializable {
    private static final long serialVersionUID = 0;
    static Elvis impersonator;
    private Elvis payload;

    private Object readResolve() {
        //save a reference to the unresolved Elvis instance;
        impersonator = payload;
        //return an object of correct type for favorites field;
        return new String[]{"A fool such as I"};
    }
}
