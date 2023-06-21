package com.poc.controller;

import com.poc.model.dto.CustomerDTO;
import com.poc.service.CustomerSA;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "customers")
public class CustomerController {

    private final CustomerSA customerSA;

    @PostMapping
    public CustomerDTO createCustomer() {
        return customerSA.createCustomer();
    }

    @GetMapping
    public List<CustomerDTO> getAllCustomers(
            @RequestParam(defaultValue = "0", required = false) int page,
            @RequestParam(defaultValue = "15", required = false) int size) {
        return customerSA.getAllCustomers(page, size);
    }

}
