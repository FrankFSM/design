package com.ralap.design.design.decorate;

/**
 * @author: ralap
 * @date: created at 2018/7/30 21:30
 */
public class Person {

    private String name;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮者:" + name);
    }
}
