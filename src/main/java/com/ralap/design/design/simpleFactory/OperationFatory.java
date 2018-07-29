package com.ralap.design.design.simpleFactory;

/**
 * @author: ralap
 * @date: created at 2018/7/29 21:38
 */
public class OperationFatory {


    public static Operation createOperation(String symbol) {
        Operation operation = null;
        switch (symbol) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new MinusOperation();
                break;
            case "*":
                operation = new MultplyOperation();
                break;
            case "/":
                operation = new DevideOperation();
                break;
            default:
                break;
        }
        return operation;
    }


}