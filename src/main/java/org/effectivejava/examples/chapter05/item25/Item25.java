package org.effectivejava.examples.chapter05.item25;

import java.util.List;

public class Item25 {

    //合法
    List<?>[] listArray = new List<?>[1];

    //不合法
    //List<String> listArray = new List<String>[1];
}
