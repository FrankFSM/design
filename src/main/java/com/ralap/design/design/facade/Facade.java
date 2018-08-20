package com.ralap.design.design.facade;

/**
 * @author: ralap
 * @date: created at 2018/8/20 11:55
 */
public class Facade {

    private Class1 class1;
    private Class2 class2;
    private Class3 class3;

    public Facade() {
        this.class1 = new Class1();
        this.class2 = new Class2();
        this.class3 = new Class3();
    }

    public void method01() {
        class1.methos01();
        class2.methos02();
    }

    public void method02() {
        class1.methos01();
        class3.methos03();
    }

    public void method03() {
        class2.methos02();
        class3.methos03();
    }

}
