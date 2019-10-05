package com.tj.ThreadTest;

/**
 * 2019/10/4
 * author:ljh
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocalSingleton t1 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + t1);
        ThreadLocalSingleton t2 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + t2);
        ThreadLocalSingleton t3 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + t3);

        Thread tt1 = new Thread(new ThreadLocalThread());
        Thread tt2 = new Thread(new ThreadLocalThread());

        tt1.start();
        tt2.start();
    }
}
