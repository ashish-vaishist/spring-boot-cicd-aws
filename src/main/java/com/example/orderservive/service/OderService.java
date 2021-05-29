package com.example.orderservive.service;

import com.example.orderservive.entity.Order;
import com.example.orderservive.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OderService {

    @Autowired
    private OrderRepo orderRepo;

    public Order bookorder(Order order){
        return  orderRepo.save(order);
    }

    public List<Order> getorder(){
        return  orderRepo.findAll();
    }


    public Order getOderById(Long id){
        return  orderRepo.getOne(id);
    }


}
