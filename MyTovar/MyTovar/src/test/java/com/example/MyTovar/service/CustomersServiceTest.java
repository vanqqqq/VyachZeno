package com.example.MyTovar.service;

import com.example.MyTovar.model.Customers;
import com.example.MyTovar.repo.CustomersRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Random;
import java.util.UUID;

import static org.hamcrest.Matchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class CustomersServiceTest {
    @Mock
    private CustomersRepository repository;

    @InjectMocks
    private CustomersServiceImpl customersService;

@Test
    public void shouldCreateUser()
{
    Customers customers = prepareUser("test@gmail.com");
    customersService.createCustomers(customers);
    Assert.assertThat(customers.getCustomer_id(), equalTo(customers.getCustomer_id()));
}


private Customers prepareUser(String email)
{
    Customers customers = new Customers();
    customers.setFirst_name("Petya");
    customers.setLast_name("Ivanov");
    customers.setEmail(email);
    customers.setAddress("kavo");
    customers.setCity("sho");
    return customers;
}


}

