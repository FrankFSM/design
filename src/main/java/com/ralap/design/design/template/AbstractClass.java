package com.ralap.design.design.template;

/**
 * @author: ralap
 * @date: created at 2018/8/20 10:54
 */
public abstract class AbstractClass {

    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    public void templateMethod() {
        primitiveOperation1();
        System.out.println("公共逻辑");
        primitiveOperation2();
    }

}
