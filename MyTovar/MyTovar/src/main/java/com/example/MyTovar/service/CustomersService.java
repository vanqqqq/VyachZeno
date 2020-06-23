package com.example.MyTovar.service;

import com.example.MyTovar.model.Customers;

import java.util.List;
import java.util.UUID;


public interface CustomersService {
    List<Customers> getAll();
    Customers getOrderCustomerId(UUID customer_id);
    Customers getByFirstname(String first_name);
    Customers getByEmail(String email);
    Customers createCustomers(Customers customers);
    Customers updateCustomers(Customers customers);
    void deleteCustomers(Customers customers);
}