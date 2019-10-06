package com.tj.pattern.prototype.simpleClone;

/**
 * 2019/10/5
 * author:ljh
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone() {
        return prototype.clone();
    }
}
