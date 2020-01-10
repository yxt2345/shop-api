package com.fh.service;

import com.fh.mapper.OrderMapper;
import com.fh.model.DataTableResult;
import com.fh.model.Order;
import com.fh.model.OrderQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceimpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    private OrderService orderService;

    @Override
    public DataTableResult queryOrderList(OrderQuery orderQuery) {
        long count = orderMapper.queryCount(orderQuery);
        List<Order> list = orderMapper.queryOrderList(orderQuery);
        DataTableResult dataTableResult = new DataTableResult(orderQuery.getDraw(), count, count, list);
        return dataTableResult;
    }

    @Override
    public Order toUpdate(Integer id) {
        return orderMapper.toUpdate(id);
    }

    @Override
    public void updateOrder(Order order) {
        orderMapper.updateOrder(order);
    }

    @Override
    public List productByName() {
        return orderMapper.productByName();
    }

    @Override
    public void addOrder(Order order) {
        order.setIsDel(1);
        orderMapper.addOrder(order);
    }

    @Override
    public void updateOrderAll(Order order) {
        orderMapper.updateOrderAll(order);
    }

}
