package com.gp20200311.passport.adapterv2;

import com.gp20200311.passport.ResultMsg;
import com.gp20200311.passport.adapterv2.adapters.*;

/**
 * 2020/3/11
 * author:ljh
 */
public class PassportForThirdAdapter implements IPassport {
    @Override
    public ResultMsg loginForQQ(String openid) {
        return processLogin(openid, LoginQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String openid) {
        return processLogin(openid, LoginWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForPhone(String phone, String code) {
        return processLogin(phone, LoginPhoneAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginTokenAdapter.class);
    }

    private ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter adapter = clazz.newInstance() ;
            if(adapter.support(adapter)) {
               return adapter.login(id, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
