package com.ralap.design.design.prototype;

/**
 * @author: ralap
 * @date: created at 2018/8/17 15:16
 */
public interface ICloneable {

    Object clone();

    void setInfo(String age, String sex);

    void setWorkInfo(String area, String company);

    void display();


}
