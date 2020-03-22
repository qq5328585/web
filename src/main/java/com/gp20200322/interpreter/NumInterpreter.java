package com.gp20200322.interpreter;

/**
 * 2020/3/22
 * author:ljh
 */
public class NumInterpreter implements INumInterpreter {
    private double value;

    public NumInterpreter(double value) {
        this.value = value;
    }

    @Override
    public double interpret() {
        return this.value;
    }
}
