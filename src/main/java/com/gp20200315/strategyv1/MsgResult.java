package com.gp20200315.strategyv1;

/**
 * 2020/3/15
 * author:ljh
 */
public class MsgResult {
    private String code;
    private String msg;
    private Object date;

    public MsgResult(String code, String msg, Object date) {
        this.code = code;
        this.msg = msg;
        this.date = date;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }
}
