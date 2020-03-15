package com.gp20200315.strategyv1.jianbingType;

import com.gp20200315.strategyv1.MsgResult;

/**
 * 2020/3/15
 * author:ljh
 */
public abstract class AbstractJianbing {

    public MsgResult getJianbing(String type, int amount) {
        if(getJianbingAmount(type) < amount) {
            return new MsgResult("500", "购买失败", "煎饼数量不足");
        }
        return new MsgResult("500", "购买成功", "购买" + amount + "套煎饼,需要支付" + getPriceByType(type) * amount);
    }

    protected abstract int getPriceByType(String type);

    protected abstract int getJianbingAmount(String type);
}
