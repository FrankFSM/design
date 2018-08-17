package com.ralap.design.design.prototype;

/**
 * 原型模式
 *
 * @author: ralap
 * @date: created at 2018/8/17 15:26
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("Ralap");
        resume.setInfo("24", "man");
        resume.setWorkInfo("北京", "有限公司");
        resume.setPserson(new Pserson("171"));

        Resume clone = (Resume) resume.clone();
        clone.setInfo("40", "Ralap02");
        resume.setHeight("181");
        resume.display();
        clone.display();
    }

}
