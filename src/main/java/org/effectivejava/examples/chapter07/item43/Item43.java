package org.effectivejava.examples.chapter07.item43;

import java.util.ArrayList;
import java.util.List;

public class Item43 {

    private final List<String> cheeseInStock = new ArrayList<String>();

    public String[] getCheese() {
        if(cheeseInStock.size() == 0)
            return null;//should replace return an empty array but not null!!!

        //omit remainders
        return new String[0];
    }

}
