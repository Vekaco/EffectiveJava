package org.effectivejava.examples.chapter04.item17;

import java.util.Date;

public class Sub extends Super {
    private final Date date; //blank final, set by constructor;
    Sub(){
        date = new Date();
    }

    @Override
    public void overrideMe() {
        System.out.println(date);
    }


}
