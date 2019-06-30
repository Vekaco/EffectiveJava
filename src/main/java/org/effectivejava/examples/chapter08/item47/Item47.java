package org.effectivejava.examples.chapter08.item47;

import java.util.Random;

public class Item47 {
    private static final Random rnd = new Random();

    //common but deeply flawed!产生0-上界的随机整数
    static int random(int n) {
        return Math.abs(rnd.nextInt()) % n;
    }


    //使用标准类库中的随机数生成
    static int effectiveRandom(int n){
        return rnd.nextInt(n);
    }



}
