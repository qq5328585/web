package com.gp20200310;

/**
 * 2020/3/10
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
//        IClass f = new SClass();
//        f.t4();

        FClass fc = new SClass();
        fc.t1();
        fc.t2();
        ((SClass) fc).t3();

    }
}
