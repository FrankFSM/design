package com.ralap.design.design.strategy;

/**
 * @author: ralap
 * @date: created at 2018/7/23 17:04
 */
public class StratetyTest {

    public static void main(String[] args) {
        CashContent cashContent = new CashContent(new CashRabate(300, 100));
        System.out.println(cashContent.price(400d));
        CashContent cashNomal = new CashContent(new CashNomal());
        System.out.println(cashNomal.price(400d));
        CashContent cashSell = new CashContent(new CashSell(0.8f));
        System.out.println(cashSell.price(400d));
    }
}
