package org.effectivejava.examples.chapter09.item57;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class Item57 {

    public void exceptionDemo(){
        //horrible abuse of exception. Don't ever do this!
        int[] range = new int[16];
        try{
            int i=0;
            while(true) {
                int a = range[i++];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //try to make exception disappear.
        }
    }
}
