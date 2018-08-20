package com.ralap.design.design.build;

/**
 * 构建者
 * @author: ralap
 * @date: created at 2018/8/20 15:33
 */
public class BuildTest {

    public static void main(String[] args) {
        Director director = new Director();
        ConcrotBuild1 build1 = new ConcrotBuild1();
        ConcrotBuild2 build2 = new ConcrotBuild2();

        director.buildProduct(build1);
        build1.getResult().show();
        System.out.println("------------");
        director.buildProduct(build2);
        build2.getResult().show();
    }

}
