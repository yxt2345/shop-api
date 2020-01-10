package com.fh.service;

import com.fh.model.DataTableResult;
import com.fh.model.Order;
import com.fh.model.OrderQuery;

import java.util.List;

public interface OrderService {
    DataTableResult queryOrderList(OrderQuery orderQuery);

    Order toUpdate(Integer id);

    void updateOrder(Order order);

    List productByName();

    void addOrder(Order order);

    void updateOrderAll(Order order);
}
