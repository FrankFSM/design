package com.ralap.design.design.observe;

/**
 * 观察者模式
 *
 * @author: ralap
 * @date: created at 2018/8/22 11:00
 */
public class ObserverTest {

    public static void main(String[] args) {
        Observer observe = new NBAObserve();
        Subject subject = new BossSubject();
        subject.add(observe);
        subject.notyify();
    }

}
