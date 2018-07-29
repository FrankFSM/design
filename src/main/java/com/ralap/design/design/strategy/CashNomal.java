package com.ralap.design.design.strategy;

/**
 * @author: ralap
 * @date: created at 2018/7/23 16:16
 */
public class CashNomal extends CashSuper {

    public CashNomal() {
    }

    @Override
    public double price(Double money) {
        return money;
    }
}
