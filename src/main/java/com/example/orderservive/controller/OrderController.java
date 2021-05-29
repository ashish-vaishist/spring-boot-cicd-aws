package com.example.orderservive.controller;

import com.example.orderservive.entity.Order;
import com.example.orderservive.service.OderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OderService oderService;

    @PostMapping("bookOrder")
    public Order bookOrder(@RequestBody Order order){

        return oderService.bookorder(order);
    }


    @PostMapping("getOrder")
    public List<Order> getOrders(){
        return oderService.getorder();
    }


    @PostMapping("getOrderById")
    public Order bookOrder(@RequestBody Long id){

        return oderService.getOderById(id);
    }




}
