package com.ralap.design.design.strategy;

/**
 * @author: ralap
 * @date: created at 2018/7/23 16:59
 */
public class CashContent {


    private CashSuper cashSuper;

    public CashContent(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double price(Double money) {
        return cashSuper.price(money);

    }
}
