package com.gp20200304;

/**
 * 2020/3/5
 * author:ljh
 */
public abstract class AbstractJianbing implements Jianbing {
    private Jianbing jianbing;

    public AbstractJianbing(Jianbing jianbing) {
        this.jianbing = jianbing;
    }

    public String getName() {
        return jianbing.getName();
    }

    public int getPrice() {
        return jianbing.getPrice();
    }
}
