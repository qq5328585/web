package com.tj.pattern.singletonPattern.lazyPattern;

/**
 * 2019/9/21
 * author:ljh
 */
public class LazySingletonFactoryTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());

        t1.start();
        t2.start();

        System.out.println("End");

//        int a = 1;
//        int b = (a++);
//        int c = ++a;
//        System.out.println(b);
//        System.out.println(c);
//        int a = 3;
//        int b = (a++) * (++a);
//        System.out.println(a);
//        System.out.println(b);
//
//        int c = 3;
//        int d = (++c) * (c++);
//        System.out.println(c);
//        System.out.println(d);
//
//        int f = 3;
//        int e = (++f) + (++f);
//        System.out.println(e);
    }
}
