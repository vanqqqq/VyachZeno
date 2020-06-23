package com.example.MyTovar.service;

import com.example.MyTovar.model.Customers;
import com.example.MyTovar.model.Orders;

import java.util.List;
import java.util.UUID;

public interface OrdersService {
    Orders getOrderById(UUID order_id);
    List<Orders> getAll();
    Orders getbyname(String order_name);
    Orders createOrder(Orders orders);
    Orders updateOrder(Orders orders);
    void deleteOrder(Orders orders);
}
