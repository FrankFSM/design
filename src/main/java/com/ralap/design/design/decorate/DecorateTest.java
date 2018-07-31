package com.ralap.design.design.decorate;

import org.junit.jupiter.api.Test;

/**
 * 装饰者模式
 * @author: ralap
 * @date: created at 2018/7/30 21:40
 */
public class DecorateTest {

    @Test
    public void test() {
        Person ralap = new Person("Ralap");
        TShirt tShirt = new TShirt();
        Trouser trouser = new Trouser();
        tShirt.decoreate(ralap);
        trouser.decoreate(tShirt);
        trouser.show();
    }

}
