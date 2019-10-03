package com.tj;


import com.tj.staticClass.StaticClass;

/**
 * 2019/9/29
 * author:ljh
 */
public class StaticClassSon extends StaticClass {
    public StaticClassSon() {
        super("123");
        System.out.println("子类构造函数");
    }

    public void ttt() {
        System.out.println("子类ttt");
    }

    public static void main(String[] args) {
        StaticClass sc = new StaticClassSon();
//        StaticClass sc = new StaticClass();
//        StaticClass.A a = sc.new A();
//        a.test();
//
//        StaticClass.S s1 = new StaticClass.S();
//        s1.test();
    }
}
