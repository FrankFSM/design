package com.ralap.design.design.build;

/**
 * @author: ralap
 * @date: created at 2018/8/20 15:30
 */
public class ConcrotBuild2 extends Build {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
