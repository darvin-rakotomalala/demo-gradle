package com.poc.service;

import com.poc.model.common.CustomerType;
import com.poc.model.domain.Address;
import com.poc.model.domain.Customer;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerSMImpl implements CustomerSM {

    List<Customer> listOfCustomers = new ArrayList<>();

    @Override
    public Customer createCustomer() {
        var newCustomer = new Customer();
        newCustomer.setId(1);
        newCustomer.setFirstName("Darvin");
        newCustomer.setLastName("Tojo");
        newCustomer.setDateOfBirth(Instant.now());
        newCustomer.setCreditScore(2000);
        newCustomer.setCustomerType(CustomerType.CUST_OK);

        var newAddress = new Address("Madagascar");
        newCustomer.setAddress(newAddress);

        listOfCustomers.add(newCustomer);

        return newCustomer;
    }

    @Override
    public List<Customer> getAllCustomers(int page, int size) {
        return listOfCustomers.stream().skip(page).limit(size).collect(Collectors.toList());
    }
}
