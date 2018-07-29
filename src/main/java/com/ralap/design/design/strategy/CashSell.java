package com.ralap.design.design.strategy;

/**
 * @author: ralap
 * @date: created at 2018/7/23 16:16
 */
public class CashSell extends CashSuper {

    private float sell;

    public CashSell(float sell) {
        this.sell = sell;
    }

    @Override
    public double price(Double money) {
        return money * sell;
    }
}
