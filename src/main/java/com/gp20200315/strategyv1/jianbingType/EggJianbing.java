package com.gp20200315.strategyv1.jianbingType;

/**
 * 2020/3/15
 * author:ljh
 */
public class EggJianbing extends AbstractJianbing {
    @Override
    protected int getPriceByType(String type) {
        return 7;
    }

    @Override
    protected int getJianbingAmount(String type) {
        return 15;
    }
}
