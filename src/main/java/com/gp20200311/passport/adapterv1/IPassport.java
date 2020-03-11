package com.gp20200311.passport.adapterv1;

import com.gp20200311.passport.ResultMsg;

/**
 * 2020/3/11
 * author:ljh
 */
public interface IPassport {
    ResultMsg loginForQQ(String openid);
    ResultMsg loginForWechat(String openid);
    ResultMsg loginForPhone(String phone, String code);
    ResultMsg loginForToken(String token);
}
