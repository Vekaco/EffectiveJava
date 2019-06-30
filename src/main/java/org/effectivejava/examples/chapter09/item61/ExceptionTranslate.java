package org.effectivejava.examples.chapter09.item61;

public class ExceptionTranslate {
    //exception Translation
    public void translate() {
        try {
            //Use lower-level abstraction to do out bidding
        } catch (UnsupportedOperationException e) {//lower-level exception
            throw new IllegalArgumentException();//higher-level exception
            //或者使用异常链
            //throw new HigherLevelException(e);
        }
    }
}
