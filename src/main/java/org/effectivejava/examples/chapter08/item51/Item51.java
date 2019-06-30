package org.effectivejava.examples.chapter08.item51;

public class Item51 {
    //inappropriate use of string concatenation - performs horribly!
    public String statement() {
        String result = "";
        for(int i=0; i< numItems();i++)
            result += lineForItem(i);
        return result;
    }

    public String statement2() {//使用StringBuilder代替String +拼接
        StringBuilder result = new StringBuilder();
        for(int i=0; i< numItems();i++)
            result.append(lineForItem(i));
        return result.toString();
    }

    int numItems() {
        return 100;//Integer.MAX_VALUE;
    }
    String lineForItem(int i) {
        return "LineForItem"+ i;
    }
}
