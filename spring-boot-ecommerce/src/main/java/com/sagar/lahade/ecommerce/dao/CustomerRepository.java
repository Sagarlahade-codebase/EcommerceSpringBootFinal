package com.sagar.lahade.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.lahade.ecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);

}
