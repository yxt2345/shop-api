package com.fh.mapper;

import com.fh.model.Order;
import com.fh.model.OrderQuery;

import java.util.List;

public interface OrderMapper {
    long queryCount(OrderQuery orderQuery);

    List<Order> queryOrderList(OrderQuery orderQuery);

    Order toUpdate(Integer id);

    void updateOrder(Order order);

    List productByName();

    void addOrder(Order order);

    void updateOrderAll(Order order);
}
