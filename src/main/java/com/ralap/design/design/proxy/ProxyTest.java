package com.ralap.design.design.proxy;

import org.junit.jupiter.api.Test;

/**
 * 代理模式
 * @author: ralap
 * @date: created at 2018/7/31 21:43
 */
public class ProxyTest {

    @Test
    public void test() {
        SchooleGirl girl = new SchooleGirl("MM");
        Proxy proxy = new Proxy(girl);
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}
