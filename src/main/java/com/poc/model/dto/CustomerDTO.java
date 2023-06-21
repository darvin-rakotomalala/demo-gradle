package com.poc.model.dto;

import com.poc.model.common.CustomerType;
import lombok.Data;
import lombok.ToString;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;

@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class CustomerDTO {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private long customerId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String firstName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lastName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double creditScore;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Instant dateOfBirth;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private CustomerType customerType;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private AddressDTO address;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fullName;
}
