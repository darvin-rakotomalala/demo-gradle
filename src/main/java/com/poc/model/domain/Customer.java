package com.poc.model.domain;

import com.poc.model.common.CustomerType;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private long id;
    private String firstName;
    private String lastName;
    private Instant dateOfBirth;
    private double creditScore;
    private CustomerType customerType;
    private Address address;
}
