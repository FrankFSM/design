package com.ralap.design.design;

/**
 * @author: ralap
 * @date: created at 2018/7/25 17:24
 */
public class Main {

    public static void main(String[] args) {

        createThread("tast", 1);
        createThread("tast", 2);
        createThread("tast", 3);
        createThread("tast", 4);
        createThread("tast", 5);

    }

    public static void createThread(String naem, int n) {
        new Thread(naem) {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println("------------>N:" + n);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
