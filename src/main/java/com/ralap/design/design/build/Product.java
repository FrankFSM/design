package com.ralap.design.design.build;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ralap
 * @date: created at 2018/8/20 15:24
 */
public class Product {

    List<String> parts = new ArrayList();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        parts.stream().forEach(s -> System.out.println("------------>" + s));
    }

}
