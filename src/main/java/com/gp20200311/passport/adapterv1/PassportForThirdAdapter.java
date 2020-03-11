package com.gp20200311.passport.adapterv1;

import com.gp20200311.passport.PassportService;
import com.gp20200311.passport.ResultMsg;

/**
 * 2020/3/11
 * author:ljh
 */
public class PassportForThirdAdapter extends PassportService implements IPassport {
    @Override
    public ResultMsg loginForQQ(String openid) {
        return loginForRegist(openid, null);
    }

    @Override
    public ResultMsg loginForWechat(String openid) {
        return loginForRegist(openid, null);
    }

    @Override
    public ResultMsg loginForPhone(String phone, String code) {
        return loginForRegist(phone, null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return loginForRegist(token, null);
    }

    private ResultMsg loginForRegist(String username, String password) {
        if(null == password) {
            password = "THIRD_EMPTY";
        }
        super.regist(username, password);
        return super.login(username, password);
    }
}
