package com.tj.pattern.singletonPattern.threadLoacal;

/**
 * 2019/10/3
 * author:ljh
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        ThreadLocalSingleton t1 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton t2 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton t3 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton t4 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton t5 = ThreadLocalSingleton.getInstance();
        System.out.println("t1: " + System.currentTimeMillis() + ":" + t1);
        System.out.println("t2: " + System.currentTimeMillis() + ":" + t2);
        System.out.println("t3: " + System.currentTimeMillis() + ":" + t3);
        System.out.println("t4: " + System.currentTimeMillis() + ":" + t4);
        System.out.println("t5: " + System.currentTimeMillis() + ":" + t5);

        Thread tt1 = new Thread(new ThreadLocalSingletonThread(), "tt1");
        Thread tt2 = new Thread(new ThreadLocalSingletonThread(), "tt2");

        tt1.start();
        tt2.start();
    }
}
