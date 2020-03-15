package com.gp20200315.strategyv1;

import com.gp20200315.strategyv1.jianbingType.JianbingStrategy;

/**
 * 2020/3/15
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("老板我来买煎饼了");
        Laoban laoban = new Laoban(10);
        System.out.println(laoban.buyJianbing(JianbingStrategy.eggJianbing));
    }
}
