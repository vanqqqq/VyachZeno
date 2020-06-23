package com.example.MyTovar.Controller;

import com.example.MyTovar.model.Customers;
import com.example.MyTovar.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.*;


@RestController
    @RequestMapping("/customers")
    public class CustomersController {

        @Autowired
        private CustomersService customersService;

    @PostMapping("create")
    public Customers createCustomers(Customers customers)
    {
        return customersService.createCustomers(customers);
    }

        @GetMapping("list")
        public List<Customers> getAll()
        {
            return customersService.getAll();
        }


    @GetMapping(path = "getCustomerId/{customer_id}")
    public Customers getOrderCustomerId(@PathVariable UUID customer_id)
    {
        return customersService.getOrderCustomerId(customer_id);
    }

    @PostMapping("update")
    public Customers updateCustomers(Customers customers)
    {
        return customersService.updateCustomers(customers);
    }


    @GetMapping("getemail/{email}")
    public Customers getByEmail(@PathVariable String email)
    {
        return customersService.getByEmail(email);
    }
    @GetMapping(path = "getname/{first_name}")
    public Customers getByFirstname(@PathVariable String first_name)
    {
        return customersService.getByFirstname(first_name);
    }


        @DeleteMapping("delete")
        public void deleteCustomers(Customers customers)
        {
            customersService.deleteCustomers(customers);
        }


}