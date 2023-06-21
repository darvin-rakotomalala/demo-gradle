package com.poc.service;

import com.poc.model.domain.Customer;

import java.util.List;

public interface CustomerSM {
    Customer createCustomer();
    List<Customer> getAllCustomers(int page, int size);
}
