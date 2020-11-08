package com.example.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.entity.Customer;

@Repository
public interface CustomerRepositroy extends JpaRepository<Customer, Integer> {

}
