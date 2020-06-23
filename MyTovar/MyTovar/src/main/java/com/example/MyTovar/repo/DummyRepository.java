package com.example.MyTovar.repo;

import com.example.MyTovar.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DummyRepository extends JpaRepository<Customers, UUID> {
}
