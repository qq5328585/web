package com.gp20200304;

/**
 * 2020/3/4
 * author:ljh
 * 扩展组件
 */
public class EggJianbing extends AbstractJianbing {
    private Jianbing jianbing;

    public EggJianbing(Jianbing jianbing) {
        super(jianbing);
    }

    public String getName() {
        return super.getName() + "1个鸡蛋";
    }

    public int getPrice() {
        return super.getPrice() + 1;
    }

}
