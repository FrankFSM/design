package com.ralap.design.design.proxy;

/**
 * @author: ralap
 * @date: created at 2018/7/31 21:36
 */
public class Pursuit implements GiveGife {

    private SchooleGirl schooleGirl;

    public Pursuit(SchooleGirl schooleGirl) {
        this.schooleGirl = schooleGirl;
    }

    @Override
    public void giveDolls() {
        System.out.println(schooleGirl.getName() + "送洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(schooleGirl.getName() + "送鲜花");

    }

    @Override
    public void giveChocolate() {
        System.out.println(schooleGirl.getName() + "送巧克力");

    }
}
