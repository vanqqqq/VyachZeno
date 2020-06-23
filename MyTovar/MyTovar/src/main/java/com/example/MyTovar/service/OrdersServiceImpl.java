package com.example.MyTovar.service;

import com.example.MyTovar.model.Customers;
import com.example.MyTovar.model.Orders;
import com.example.MyTovar.repo.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public Orders getOrderById(UUID order_id) {
        return ordersRepository.findById(order_id).get();
    }

    @Override
    public List<Orders> getAll() {
        return ordersRepository.findAll();
    }

    @Override
    public Orders createOrder(Orders orders) {
        Orders save = ordersRepository.save(orders);
        return save;
    }



    @Override
    public Orders getbyname(String order_name) {
        Orders orders = new Orders();
        orders.setOrder_name(order_name);
        return ordersRepository.findOne(Example.of(orders)).get();

    }



    @Override
    public Orders updateOrder(Orders orders) {
        return ordersRepository.save(orders);
    }

    @Override
    public void deleteOrder(Orders orders) {
        ordersRepository.delete(orders);
    }

    }
