package com.ralap.design.design.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ralap
 * @date: created at 2018/8/22 10:52
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void detalc(Observer observer) {
        observers.remove(observer);
    }

    public void notyify() {
        observers.stream().forEach(observer -> {
            observer.update();
        });
    }

}
