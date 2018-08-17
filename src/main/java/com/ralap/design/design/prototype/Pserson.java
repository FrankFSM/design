package com.ralap.design.design.prototype;

/**
 * @author: ralap
 * @date: created at 2018/8/17 15:36
 */
public class Pserson implements Cloneable {

    private String height;

    public Pserson(String height) {
        this.height = height;
    }


    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Pserson{" +
                "height='" + height + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
