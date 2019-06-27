package org.effectivejava.examples.chapter07.item43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RightWay {

    // the right way to return an array from a collection
    private final List<String> cheeseInStock = new ArrayList<String>();

    private static final String[] EMPTY_CHEESE = new String[0];
    public String[] getCheeses() {
        //当EMPTY_CHEESE 足够容纳元素时，不会创建新数组，否则创建新数组以容纳元素。
        return cheeseInStock.toArray(EMPTY_CHEESE);
    }

    //the right way to return a copy of collection
    public List<String> getCheeseList(){
        if(cheeseInStock.isEmpty())
            return Collections.emptyList();
        else
            return new ArrayList<String>(cheeseInStock);
    }
}
