package org.effectivejava.examples.chapter11.item77;

import java.io.Serializable;
import java.util.Arrays;

//broken singleton - has non-transient object reference field
public class Elvis implements Serializable {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis(){}
    private String[] favoriteSongs = {"Hound Dog", "Heartbreak Hotel"};
    public void printFavorites(){
        System.out.println(Arrays.toString(favoriteSongs));
    }
    private Object readREsolve() {return INSTANCE;}

}
