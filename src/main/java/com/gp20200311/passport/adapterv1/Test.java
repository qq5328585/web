package com.gp20200311.passport.adapterv1;

import com.gp20200311.passport.ResultMsg;

/**
 * 2020/3/11
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        PassportForThirdAdapter passport = new PassportForThirdAdapter();
        ResultMsg resultMsg = passport.login("aaa", "123456789");
        System.out.println(resultMsg.getMsg());
        resultMsg = passport.loginForQQ("jkashdjkhasjkd");
        System.out.println(resultMsg.getMsg());
        resultMsg = passport.loginForWechat("jkashdjkhasjkd");
        System.out.println(resultMsg.getMsg());
        resultMsg = passport.loginForPhone("15911111111", "9089");
        System.out.println(resultMsg.getMsg());
        resultMsg = passport.loginForToken("ajkshdkj");
        System.out.println(resultMsg.getMsg());
    }
}
