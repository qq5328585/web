package com.gp20200311.interfaceAdapter;

/**
 * 2020/3/11
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        DCAdapter dcAdapter = new PowerAdapter(new DC220V());
        System.out.println(dcAdapter.outputDC5V());
        System.out.println(dcAdapter.outputDC12V());
        System.out.println(dcAdapter.outputDC24V());
    }
}
