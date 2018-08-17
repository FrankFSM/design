package com.ralap.design.design.prototype;

/**
 * @author: ralap
 * @date: created at 2018/8/17 15:22
 */
public class Resume implements Cloneable {

    private Pserson pserson;
    private String name;
    private String age;
    private String sex;
    private String arae;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public void setHeight(String height) {
        pserson.setHeight(height);

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Resume clone = (Resume) super.clone();
        //深拷贝
        clone.pserson = (Pserson) this.pserson.clone();
        return clone;
    }


    public void setInfo(String age, String sex) {
        this.age = age;
        this.sex = sex;

    }


    public void setWorkInfo(String area, String company) {
        this.arae = area;
        this.company = company;
    }

    public void setPserson(Pserson pserson) {
        this.pserson = pserson;
    }

    public void display() {
        System.out.println("------------>" + toString());
    }

    @Override
    public String toString() {
        return "Resume{" +
                "pserson=" + pserson.toString() +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", arae='" + arae + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
