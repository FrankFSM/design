package com.ralap.design.design.factory;

/**
 * @author: ralap
 * @date: created at 2018/8/17 15:00
 */
public class FactoryTest {

    public static void main(String[] args) {
        IFactory iFactory = new AddFactory();
        Operation operation = iFactory.createOperation();
        double result = operation.getResult(1.1, 2.2);
        System.out.println("------------>" + result);



    }

}
