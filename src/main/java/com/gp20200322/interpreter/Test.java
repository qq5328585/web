package com.gp20200322.interpreter;

/**
 * 2020/3/22
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new Calculator("1 + 2 + 3 + 4").getFinalValue());
        System.out.println(new Calculator("1 + 2 * 3 - 4").getFinalValue());
        System.out.println(new Calculator("1 + 2 * 3 - 4 / 5 * 5 / 10").getFinalValue());
        System.out.println(new Calculator("10 + 32 * 93 - 240 / 5").getFinalValue());
        System.out.println(new Calculator("1 + 5 * 3 + 6 * 4 - 10 / 5 - 7").getFinalValue());
    }
}
