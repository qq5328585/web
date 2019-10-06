package com.tj.pattern.prototype.deepClone;

import java.io.Serializable;

/**
 * 2019/10/5
 * author:ljh
 */
public class JinGuBang implements Serializable {
    private int height;
    private int weight;

    public void big() {
        this.height = this.height * 2;
        this.weight = this.weight * 2;
    }

    public void small() {
        this.height = this.height / 2;
        this.weight = this.weight / 2;
    }
}
