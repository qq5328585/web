package com.gp20200304;

/**
 * 2020/3/4
 * author:ljh
 * 基础组件
 */
public class BaseJianbing implements Jianbing {

    @Override
    public String getName() {
        return "这是煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
