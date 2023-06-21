package com.poc.mapper;

import com.poc.model.domain.Customer;
import com.poc.model.dto.CustomerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(uses = {AddressMapper.class})
public interface CustomerMapper {

    @Mapping(target = "customerId", source = "id")
    @Mapping(target = "fullName", expression = "java(customer.getFirstName() + customer.getLastName())")
    CustomerDTO customerToDto(Customer customer);

    List<CustomerDTO> listToDto(List<Customer> customers);
}
