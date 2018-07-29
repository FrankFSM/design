package com.ralap.design.design.strategy;

/**
 * @author: ralap
 * @date: created at 2018/7/23 16:16
 */
public class CashRabate extends CashSuper {

    private int base;
    private int rabate;

    public CashRabate(int base, int rabate) {
        this.base = base;
        this.rabate = rabate;
    }

    @Override
    public double price(Double money) {
        if (money > base) {
            return money - rabate;
        }
        return money;
    }
}
