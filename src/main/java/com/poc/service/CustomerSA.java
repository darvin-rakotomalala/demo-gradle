package com.poc.service;

import com.poc.model.dto.CustomerDTO;

import java.util.List;

public interface CustomerSA {
    CustomerDTO createCustomer();
    List<CustomerDTO> getAllCustomers(int page, int size);
}
