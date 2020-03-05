package com.gp20200304;

/**
 * 2020/3/5
 * author:ljh
 */
public class LatiaoJianbing extends AbstractJianbing {
    private Jianbing jianbing;

    public LatiaoJianbing(Jianbing jianbing) {
        super(jianbing);
    }

    public String getName() {
        return super.getName() + "1包拉条";
    }

    public int getPrice() {
        return super.getPrice() + 2;
    }

}
