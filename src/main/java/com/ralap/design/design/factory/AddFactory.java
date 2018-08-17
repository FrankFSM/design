package com.ralap.design.design.factory;

/**
 * @author: ralap
 * @date: created at 2018/8/17 14:56
 */
public class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}
