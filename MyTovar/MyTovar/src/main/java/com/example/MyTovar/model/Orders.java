package com.example.MyTovar.model;

import org.hibernate.dialect.CUBRIDDialect;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="orders")
public class Orders {
    @Id
    private UUID order_id;
    private String order_date;
    private String order_name;
    private Double order_cost;
    private Integer amount;
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customers customers;

    public UUID getOrder_id() {
        return order_id;
    }

    public void setOrder_id(UUID order_id) {
        this.order_id = order_id;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public Double getOrder_cost() {
        return order_cost;
    }

    public void setOrder_cost(Double order_cost) {
        this.order_cost = order_cost;
    }


    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Customers getCustomers() {
        return customers;
    }


    public void setCustomers(Customers customers) {
        this.customers = customers;
    }
    public Orders()
    {

    }
     public Orders (UUID order_id, String order_date, String order_name, Double order_cost, Integer amount, Customers customers)
     {
       this.order_id=order_id;
       this.order_date=order_date;
         this.order_name=order_name;
         this.order_cost=order_cost;
      this.amount=amount;
     this.customers=customers;
}
    }

