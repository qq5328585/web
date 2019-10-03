package com.tj.staticClass;

/**
 * 2019/9/29
 * author:ljh
 */
public class ProtectedClassSon extends ProtectedClass {
    public static void main(String[] args) {
        ProtectedClass a = new ProtectedClass();
        a.test();
        ProtectedClass aa = new ProtectedClassSon();
        aa.test();
        ProtectedClassSon son = new ProtectedClassSon();
        son.test();
    }
}
