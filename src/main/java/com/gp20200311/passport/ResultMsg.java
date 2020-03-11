package com.gp20200311.passport;

/**
 * 2020/3/11
 * author:ljh
 */
public class ResultMsg {
    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public ResultMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
