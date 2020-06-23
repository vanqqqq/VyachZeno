package com.example.MyTovar.Controller;
import com.example.MyTovar.model.Customers;
import com.example.MyTovar.model.Orders;
import com.example.MyTovar.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @PostMapping("create")
    public Orders createOrder(Orders orders) {
        return ordersService.createOrder(orders);
    }

    @GetMapping("list")
    public List<Orders> getAll()
    {
        return ordersService.getAll();
    }

    @GetMapping(path = "getOrderById/{order_id}")
    public Orders getOrderById(@PathVariable UUID order_id)
    {
        return ordersService.getOrderById(order_id);
    }



    @GetMapping("getbyname/{order_name}")
    public Orders getbyname(@PathVariable String order_name)
    {
       return ordersService.getbyname(order_name);
    }

    @PostMapping("update")
    public Orders updateOrders(Orders orders)
    {
        return ordersService.updateOrder(orders);
    }

    @DeleteMapping
    public void deleteOrder(Orders orders)
    {
        ordersService.deleteOrder(orders);
    }

}
