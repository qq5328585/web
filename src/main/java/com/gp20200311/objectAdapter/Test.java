package com.gp20200311.objectAdapter;

/**
 * 2020/3/11
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        DC5V dc5V = new PowerAdapter(new DC220V());
        System.out.println(dc5V.output5V());
    }
}
