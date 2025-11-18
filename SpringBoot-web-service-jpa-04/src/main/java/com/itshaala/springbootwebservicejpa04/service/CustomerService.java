package com.itshaala.springbootwebservicejpa04.service;

import com.itshaala.springbootwebservicejpa04.dto.CreateCustomerRequestDto;
import com.itshaala.springbootwebservicejpa04.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    CustomerDto create(CreateCustomerRequestDto createCustomerRequestDto);
    CustomerDto update(int id, CreateCustomerRequestDto createCustomerRequestDto);
    void delete(int id);
    CustomerDto findById(int id);
    List<CustomerDto> findAll();
}
