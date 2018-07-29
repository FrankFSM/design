package com.ralap.design.design.simpleFactory;

/**
 * @author: ralap
 * @date: created at 2018/7/29 21:41
 */
public class DevideOperation extends Operation {


    @Override
    public double getResult(double arg0, double arg1) {
        if (arg1 != 0) {
            return arg0 / arg1;
        } else {
            System.out.println("除数不能为0");
            return 0;
        }
    }
}
