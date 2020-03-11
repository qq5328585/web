package com.gp20200311.classAdapte;

/**
 * 2020/3/11
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        PowerAdapter adapter = new PowerAdapter();
        System.out.println(adapter.output220V());
        System.out.println(adapter.output5V());
    }
}
