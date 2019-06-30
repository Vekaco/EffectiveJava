package org.effectivejava.examples.chapter08.item48;

import java.math.BigDecimal;

public class Item48 {

    public static void main(String[] args) {
        //假设你的口袋中有$1.03花掉￠42
        System.out.println(1.03 - .42);

        //假设你的口袋中有$1，你买了9个垫圈，每个为￠10
        System.out.println(1.00 - 9 * .10);

        //假设你的口袋中有$1，货架上有￠10，￠20，￠30，...$1的糖果
        //你从￠10开始，每种买一颗，知道付不起为止，那么可以买多少糖果，找回多少零钱
        //broken - uses floating point for monetary calculation!!!
        double funds = 1.00;
        int itemBought = 0;
        for (double price = .10;funds>=price;price+=.10) {
            funds -=price;
            itemBought++;
        }
        System.out.println(itemBought + " item(s) bought.");
        System.out.println("Change: $" +funds);

        //right way! 用BigDecimal,int或者long进行货币计算
        final BigDecimal TEN_CENTS = new BigDecimal(".10");
        itemBought = 0;

        BigDecimal baseFunds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS; baseFunds.compareTo(price) >=0; price=price.add(TEN_CENTS)){
            itemBought++;
            baseFunds = baseFunds.subtract(price);
        }
        System.out.println(itemBought + " item(s) bought");
        System.out.println("Change: $" + baseFunds);

        //以美分为单位 用long或者int来实现以上计算，也可。
        itemBought = 0;
        int intFunds = 100;
        for(int price=10; intFunds>=price;price+=10) {
            itemBought++;
            intFunds -=price;
        }
        System.out.println(itemBought + " item(s) bought.");
        System.out.println("Change: $" + intFunds);
    }
}
