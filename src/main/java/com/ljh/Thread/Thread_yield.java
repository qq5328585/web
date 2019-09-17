package com.ljh.Thread;

/**
 * 2019/9/10
 * author:ljh
 */
public class Thread_yield {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1 is running");
                Thread.yield();
                System.out.println("t1 is running over");
            }
        },"t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2 is running");
            }
        }, "t2");

        t1.start();
        t2.start();
    }
}
