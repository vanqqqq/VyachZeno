package com.example.MyTovar.service;

import com.example.MyTovar.model.Customers;
import com.example.MyTovar.repo.CustomersRepository;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class CustomersServiceImpl implements CustomersService {

    @Autowired
    private CustomersRepository customersRepository;


    @Override
    public Customers createCustomers(Customers customers) {
        /*if (customers.getEmail() == null) {
            throw new IllegalArgumentException("email is empty");
        }*/
        if (customers.getEmail().length()<1)
        {
            throw new IllegalStateException("bad email");
        }
        if (customers.getEmail().isEmpty())
        {
            throw new IllegalStateException("No email");
        }
        if (customers.getFirst_name().contains("!"))
        {
            throw new IllegalStateException("bad name");
        }

        customersRepository.save(customers);
        return customers;

    }




    @Override
    public Customers getByFirstname(String first_name) {
        Customers customers = new Customers();
        customers.setFirst_name(first_name);
        return customersRepository.findOne(Example.of(customers)).get();
    }

    @Override
    public Customers getByEmail(String email) {
        Customers customers = new Customers();
        customers.setEmail(email);
        return customersRepository.findOne(Example.of(customers)).get();

    }

    @Override
    public List<Customers> getAll() {

        List<Customers> all = customersRepository.findAll();
        if(CollectionUtils.isEmpty(all))
        {
            System.out.println("There ane no customers in db");
        }
        return all;

    }
    @Override
    public Customers getOrderCustomerId(UUID customer_id) {
        return customersRepository.findById(customer_id).get();
    }



    @Override
    public Customers updateCustomers(Customers customers) {
return customersRepository.save(customers);
    }

    @Override
    public void deleteCustomers(Customers customers) {
customersRepository.delete(customers);
    }
}
