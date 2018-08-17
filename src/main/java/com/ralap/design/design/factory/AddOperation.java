package com.ralap.design.design.factory;

/**
 * @author: ralap
 * @date: created at 2018/7/29 21:41
 */
public class AddOperation extends Operation {


    @Override
    public double getResult(double arg0, double arg1) {
        return arg0 + arg1;
    }
}
