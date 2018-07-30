package com.ralap.design.design.decorate;

/**
 * @author: ralap
 * @date: created at 2018/7/30 21:35
 */
public class Finery extends Person {

    protected Person person;

    public void decoreate(Person person) {
        this.person = person;

    }

    @Override
    public void show() {
        if(person != null){
            person.show();
        }
    }
}
