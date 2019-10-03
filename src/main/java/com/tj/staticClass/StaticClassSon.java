package com.tj.staticClass;

/**
 * 2019/9/29
 * author:ljh
 */
public class StaticClassSon extends StaticClass {
    public static void main(String[] args) {
        StaticClass sc = new StaticClass();
        StaticClass.A a = sc.new A();
        a.test();

        StaticClass.AA aa = sc.new AA();
        aa.test();

        ProtectedClass pc = new ProtectedClass();
        pc.test();
    }
}
