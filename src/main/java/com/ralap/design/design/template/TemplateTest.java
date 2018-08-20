package com.ralap.design.design.template;

/**
 * 模板模式
 * @author: ralap
 * @date: created at 2018/8/20 11:00
 */
public class TemplateTest {

    public static void main(String[] args) {
        AbstractClass class1 = new ConcreateClassA();
        AbstractClass class2 = new ConcreateClassB();
        class1.templateMethod();
        class2.templateMethod();
    }

}
