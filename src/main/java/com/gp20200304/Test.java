package com.gp20200304;

/**
 * 2020/3/4
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        Jianbing f = new BaseJianbing();
        System.out.println(f.getName());
        System.out.println("总价: " + f.getPrice());

        AbstractJianbing abstractJianbing = new EggJianbing(f);
        System.out.println(abstractJianbing.getName());
        System.out.println("总价: " + abstractJianbing.getPrice());

        abstractJianbing = new LatiaoJianbing(abstractJianbing);
        System.out.println(abstractJianbing.getName());
        System.out.println("总价: " + abstractJianbing.getPrice());
    }
}
