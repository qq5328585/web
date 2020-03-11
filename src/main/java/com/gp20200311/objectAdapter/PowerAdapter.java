package com.gp20200311.objectAdapter;

/**
 * 2020/3/11
 * author:ljh
 */
public class PowerAdapter implements DC5V {
    private DC220V dc220V;

    public PowerAdapter(DC220V dc220V) {
        this.dc220V = dc220V;
    }

    @Override
    public int output5V() {
        return dc220V.output220V() / 44;
    }
}
