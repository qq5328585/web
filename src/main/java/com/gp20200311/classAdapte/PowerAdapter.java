package com.gp20200311.classAdapte;

/**
 * 2020/3/11
 * author:ljh
 */
public class PowerAdapter extends DC220V implements DC5V {

    @Override
    public int output5V() {
        int adapterInput = super.output220V();
        int adapterOutput = adapterInput / 44;
        return adapterOutput;
    }
}
