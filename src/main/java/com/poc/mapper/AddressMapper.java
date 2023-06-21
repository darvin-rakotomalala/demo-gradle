package com.poc.mapper;

import com.poc.model.domain.Address;
import com.poc.model.dto.AddressDTO;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {
    AddressDTO addressToDto(Address address);
}
