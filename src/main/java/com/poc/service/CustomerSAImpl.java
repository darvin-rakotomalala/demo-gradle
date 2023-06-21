package com.poc.service;

import com.poc.mapper.CustomerMapper;
import com.poc.model.dto.CustomerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerSAImpl implements CustomerSA {

    private final CustomerSM customerSM;
    private final CustomerMapper customerMapper;

    @Override
    public CustomerDTO createCustomer() {
        return customerMapper.customerToDto(customerSM.createCustomer());
    }

    @Override
    public List<CustomerDTO> getAllCustomers(int page, int size) {
        return customerMapper.listToDto(customerSM.getAllCustomers(page, size));
    }
}
