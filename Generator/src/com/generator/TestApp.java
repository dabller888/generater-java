package com.generator;

/**
 * Created by Administrator on 2018/6/20.
 */
public class TestApp {

    public static void main(String[] args) {

        Thread myThread = Thread.currentThread();
        System.out.println(myThread);
        myThread.setName("myThread.io");
        System.out.println(myThread);
        try {
            for (int i = 0; i < 13; i++) {
                System.out.println("执行" + i);
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
