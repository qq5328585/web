package com.tj.pattern.proxyPattern.dbRoute;

import com.tj.pattern.proxyPattern.dbRoute.proxy.OrderStaticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2019/10/27
 * author:ljh
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");

            Date date = sdf.parse("2017/01/01");

            Order order = new Order();
            order.setCreateDate(date);
            IOrderService proxy = new OrderStaticProxy(new OrderService());
            proxy.createOrder(order);
        } catch(Exception e) {
           e.printStackTrace();
        }
    }
}
