package com.tj.pattern.proxyPattern.dbRoute.proxy;

import com.tj.pattern.proxyPattern.dbRoute.IOrderService;
import com.tj.pattern.proxyPattern.dbRoute.Order;
import com.tj.pattern.proxyPattern.dbRoute.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2019/10/27
 * author:ljh
 */
public class OrderStaticProxy implements IOrderService{

    private IOrderService orderService;

    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    public OrderStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public boolean createOrder(Order order) {
        Date date = order.getCreateDate();
        Integer dbRouter = Integer.valueOf(yearFormat.format(date));
        System.out.println("静态代理自动分配到DB_" + dbRouter + "数据源处理数据");
        DynamicDataSourceEntity.set(dbRouter);
        this.orderService.createOrder(order);
        DynamicDataSourceEntity.restore();
        return true;
    }
}
