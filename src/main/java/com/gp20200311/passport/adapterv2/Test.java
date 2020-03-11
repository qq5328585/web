package com.gp20200311.passport.adapterv2;

import com.gp20200311.passport.ResultMsg;

/**
 * 2020/3/11
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        IPassport passport = new PassportForThirdAdapter();
        ResultMsg resultMsg = passport.loginForQQ("dsjfjsdj");
        System.out.println(resultMsg.getMsg());
    }
}
