package com.tj.Thread;

/**
 * 2019/9/10
 * author:ljh
 */
public class Thread_t1t2t3 {
    public static void main(String[] args) {
        final Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1 is running");
            }
        }, "t1");

        final Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2 is running");
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2 is running over");
            }
        }, "t2");

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t3 is running");
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t3 is running over");
            }
        }, "t3");

        t1.start();
        t2.start();
        t3.start();
    }
}
