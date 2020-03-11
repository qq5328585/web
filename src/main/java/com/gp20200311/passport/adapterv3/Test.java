package com.gp20200311.passport.adapterv3;

import com.gp20200311.passport.ResultMsg;
import com.gp20200311.passport.adapterv3.adapters.LoginDYAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 * 2020/3/11
 * author:ljh
 */
public class Test {
    public static void main(String[] args) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("username", "zhangsan");
        IPassport passport = new PassportForThirdAdapter();
        ResultMsg resultMsg = passport.processLogin(params, LoginDYAdapter.class);
        System.out.println(resultMsg.getMsg());
    }
}
