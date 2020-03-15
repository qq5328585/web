package com.gp20200315.strategyv1;

import com.gp20200315.strategyv1.jianbingType.AbstractJianbing;
import com.gp20200315.strategyv1.jianbingType.JianbingStrategy;

/**
 * 2020/3/15
 * author:ljh
 */
public class Laoban {
    private int amount;

    public Laoban(int amount) {
        this.amount = amount;
    }

    public MsgResult buyJianbing() {
        return buyJianbing(JianbingStrategy.defaultianbing);
    }

    public MsgResult buyJianbing(String key) {
        AbstractJianbing abstractJianbing = JianbingStrategy.getJianbing(key);
        return abstractJianbing.getJianbing(key, amount);
    }
}
