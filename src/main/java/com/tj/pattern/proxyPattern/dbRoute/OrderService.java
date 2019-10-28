package com.tj.pattern.proxyPattern.dbRoute;

/**
 * 2019/10/27
 * author:ljh
 */
public class OrderService implements IOrderService{
    private OrderDao orderDao;

    public OrderService() {
        orderDao = new OrderDao();
    }

    @Override
    public boolean createOrder(Order order) {
        System.out.println("service调用dao创建订单");
        orderDao.insert(order);
        return true;
    }
}
