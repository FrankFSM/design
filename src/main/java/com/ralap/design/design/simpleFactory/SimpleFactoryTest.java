package com.ralap.design.design.simpleFactory;


import org.junit.jupiter.api.Test;

/**
 * 简单工厂
 * @author: ralap
 * @date: created at 2018/7/29 21:59
 */
public class SimpleFactoryTest {

    @Test
    public void test() {
        Operation operation = null;
        operation = OperationFatory.createOperation("+");
        System.out.println(operation.getResult(1,2));
        operation = OperationFatory.createOperation("-");
        System.out.println(operation.getResult(1,2));
        operation = OperationFatory.createOperation("*");
        System.out.println(operation.getResult(1,2));
        operation = OperationFatory.createOperation("/");
        System.out.println(operation.getResult(1,2));

    }
}
