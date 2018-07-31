package com.ralap.design.design.proxy;

/**
 * @author: ralap
 * @date: created at 2018/7/31 21:41
 */
public class Proxy implements GiveGife {

    private Pursuit pursuit;

    public Proxy(SchooleGirl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void giveDolls() {
            pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();

    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();

    }
}
