package com.tj.staticClass;

import com.tj.User;

/**
 * 2019/9/29
 * author:ljh
 */
public class StaticClass {
    int i = 1;
    int j = 1;
    static int s = 1;
    static int ss = 1;
    User u = new User();

    public StaticClass() {
        System.out.println("父类构造函数");
        ttt();
    }

    public StaticClass(String name) {
        System.out.println("父类一个参数构造函数");
        ttt();
    }

    public void ttt() {
        System.out.println("父类ttt");
    }

    //内部类A
    public class A {
        //非静态内部类,内部无法定义静态方法，静态块,静态成员变量，但可以定义静态常量
//        static void test() {
//
//        }
//        static {
//
//        }
//        static int b = 1;
        static final int tt = 1;
//        int i = 2;

        public void test() {
            i = 3;
            System.out.println("i: " + i);
            u.setName("zhangsan");
            System.out.println("j: " + j);
            j = 2;
            System.out.println("j: " + j);
            System.out.println("s: " + s);
            System.out.println("tt: " + tt);
        }
    }

    public static class S {
        int i = 1;
        static int s = 0;

        public static void main(String[] args) {
//            System.out.println("Static class: " + StaticClass.this);
            System.out.println("S s: " + s);
        }

        public void test() {
            System.out.println("S s: " + s);
            System.out.println("S ss: " + ss);
            s = 2;
            ss = 2;
            System.out.println("S s: " + s);
            System.out.println("S ss: " + ss);
        }
    }

    public void test() {
        A a = new A();
        a.test();
        System.out.println("tt1: " + a.tt);
        AA aa = new AA();
        aa.test();
    }

    protected class AA {
//        int i = 3;

        public void test() {
            A a1 = new A();
            a1.test();
            System.out.println("AA i: " + i);
            System.out.println("AA j: " + j);
        }
    }

    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass();
        staticClass.test();
        System.out.println(staticClass.j);
        System.out.println(staticClass.u.getName());

//        StaticClass.S s = staticClass.S
        S s1 = new S();
        s1.test();
    }
}
