package com.tj.ClassLoading;

/**
 * 2019/10/3
 * author:ljh
 */
public class A extends  B{
    public int a = 100;

    public A() {
        super();
        System.out.println("A a: " + a);
        a = 200;
    }

    public static void main(String[] args) {
        System.out.println(new A().a);
    }
}

class B {
    public String b = "1";

    public B() {
        System.out.println("b: " + b);
        System.out.println(((A)this).a);
    }
}
