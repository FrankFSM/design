package com.ralap.design.design.facade;

/**
 * @author: ralap
 * @date: created at 2018/8/20 11:58
 */
public class FacadeTest {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method01();
        System.out.println("------------>");
        facade.method02();
        System.out.println("------------>");
        facade.method03();
        System.out.println("------------>");
    }

}
