package com.itshaala.springbootwebservicejpa04.util;

import com.itshaala.springbootwebservicejpa04.dto.CreateCustomerRequestDto;
import com.itshaala.springbootwebservicejpa04.dto.CustomerDto;
import com.itshaala.springbootwebservicejpa04.model.Customer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomerMapper {
    public static Customer getCustomer(CustomerDto customerDto){
        Customer customer=new Customer();
        customer.setId(customerDto.getId());
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setPhone(customerDto.getPhone());
        return customer;
    }

    public static Customer getCustomer(CreateCustomerRequestDto dto) {
        Customer customer = new Customer();
        customer.setName(dto.getName());
        customer.setEmail(dto.getEmail());
        customer.setPhone(dto.getPhone());
        return customer;
    }

    public static CustomerDto getCustomerDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setPhone(customer.getPhone());
        return customerDto;
    }

}
