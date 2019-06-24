package org.effectivejava.examples.chapter05.item25;

import java.util.List;

public class MyFunction {
    //reduction without generics and with concurrency flaw.
    static Object reduce(List list, Function f, Object initVal){
        synchronized (list){
            Object result = initVal;
            for(Object o: list)
                result = f.apply(result, o);
            return result;
        }
    }
}
