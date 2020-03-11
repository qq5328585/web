package com.gp20200311.passport.adapterv2.adapters;

import com.gp20200311.passport.PassportService;
import com.gp20200311.passport.ResultMsg;

/**
 * 2020/3/11
 * author:ljh
 */
public abstract class AbstractLogin extends PassportService implements ILoginAdapter {
    protected ResultMsg loginForRegist(String username, String password) {
        if(null == password) {
            password = "THIRD_EMPTY";
        }
        super.regist(username, password);
        return super.login(username, password);
    }
}
