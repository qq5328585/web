package com.gp20200311.passport;

/**
 * 2020/3/11
 * author:ljh
 */
public class PassportService {
    public ResultMsg regist(String username, String password) {
        return new ResultMsg("200", "注册成功");
    }

    public ResultMsg login(String username, String password) {
        return new ResultMsg("200", "登录成功");
    }
}
