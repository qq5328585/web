package com.gp20200311.interfaceAdapter;

/**
 * 2020/3/11
 * author:ljh
 */
public class PowerAdapter implements DCAdapter {
    private DC220V dc220V;

    public PowerAdapter(DC220V dc220V) {
        this.dc220V = dc220V;
    }

    @Override
    public int outputDC5V() {
        return dc220V.output220V() / 44;
    }

    @Override
    public int outputDC12V() {
        return dc220V.output220V() / 18;
    }

    @Override
    public int outputDC24V() {
        return dc220V.output220V() / 9;
    }
}
