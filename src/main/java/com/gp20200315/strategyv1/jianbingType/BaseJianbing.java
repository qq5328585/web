package com.gp20200315.strategyv1.jianbingType;

/**
 * 2020/3/15
 * author:ljh
 */
public class BaseJianbing extends AbstractJianbing {

    @Override
    protected int getPriceByType(String type) {
        return 5;
    }

    @Override
    protected int getJianbingAmount(String type) {
        return 10;
    }
}
