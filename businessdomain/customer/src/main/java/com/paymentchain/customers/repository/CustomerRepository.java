package com.paymentchain.customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentchain.customers.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
