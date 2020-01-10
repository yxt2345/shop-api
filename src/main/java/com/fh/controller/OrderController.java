package com.fh.controller;

import com.fh.model.DataTableResult;
import com.fh.model.Order;
import com.fh.model.OrderQuery;
import com.fh.model.ServerResponse;
import com.fh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @RequestMapping("productByName")
    public List productByName(){
        List list = orderService.productByName();
        return list;
    }




    @RequestMapping("queryOrderList")
    public ServerResponse queryOrderList(@RequestBody OrderQuery orderQuery) {
        try {
            DataTableResult dataTableResult = orderService.queryOrderList(orderQuery);
            return ServerResponse.success(dataTableResult);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }
    @RequestMapping("addOrder")
    public ServerResponse addOrder(Order order) {
        try {
            orderService.addOrder(order);
            return ServerResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }
    @RequestMapping("toUpdate")
    public ServerResponse toUpdate(Integer id) {
        try {
            Order order = orderService.toUpdate(id);
            return ServerResponse.success(order);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }
    @RequestMapping("deleteOrder")
    public ServerResponse deleteOrder(Integer id) {
        try {
           Order order =  orderService.toUpdate(id);
            order.setIsDel(2);
            orderService.updateOrder(order);
            return ServerResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }
    @RequestMapping("updateOrder")
    public ServerResponse updateOrder(Order order) {
        try {
            orderService.updateOrderAll(order);
            return ServerResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }



}
