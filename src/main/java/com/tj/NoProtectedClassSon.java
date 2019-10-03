package com.tj;

import com.tj.staticClass.ProtectedClass;

/**
 * 2019/9/29
 * author:ljh
 */
public class NoProtectedClassSon extends ProtectedClass {
    public void aa() {
        super.test();
    }
    public static void main(String[] args) {
//        ProtectedClass.test();
//        ProtectedClass aa = new ProtectedClass();
//        aa.test();
        NoProtectedClassSon aaa = new NoProtectedClassSon();
        aaa.test();
        NoProtectedClassSon a = new NoProtectedClassSon();
        a.aa();
    }
}
