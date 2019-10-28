package com.tj.pattern.proxyPattern.dbRoute;

/**
 * 2019/10/27
 * author:ljh
 */
public class OrderDao {

    public boolean insert(Order order) {
        System.out.println("创建订单成功");
        return true;
    }
}
