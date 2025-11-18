package com.itshaala.springbootwebservicejpa04.service;

import com.itshaala.springbootwebservicejpa04.dao.CustomerRepository;
import com.itshaala.springbootwebservicejpa04.dto.CreateCustomerRequestDto;
import com.itshaala.springbootwebservicejpa04.dto.CustomerDto;
import com.itshaala.springbootwebservicejpa04.model.Customer;
import com.itshaala.springbootwebservicejpa04.util.CustomerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class CustomerServiceImp implements CustomerService {

    private CustomerRepository customerRepository;

    @Override
    public CustomerDto create(CreateCustomerRequestDto createCustomerRequestDto) {
        Customer savedCustomerObj=customerRepository.save(CustomerMapper.getCustomer(createCustomerRequestDto));
        return CustomerMapper.getCustomerDto(savedCustomerObj);
    }

    @Override
    public CustomerDto update(int id, CreateCustomerRequestDto createCustomerRequestDto) {
        Customer savedCustomerObj=customerRepository.findById(id).get();
        savedCustomerObj.setName(createCustomerRequestDto.getName());
        savedCustomerObj.setEmail(createCustomerRequestDto.getEmail());
        savedCustomerObj.setPhone(createCustomerRequestDto.getPhone());

        Customer updatedCustomerObj=customerRepository.save(savedCustomerObj);
        return CustomerMapper.getCustomerDto(updatedCustomerObj)    ;
    }

    @Override
    public void delete(int id) {
        if(customerRepository.existsById(id)){
            customerRepository.deleteById(id);
        }
    }

    @Override
    public CustomerDto findById(int id) {
        Customer customer=customerRepository.findById(id).get();
        return CustomerMapper.getCustomerDto(customer);
    }


    @Override
    public List<CustomerDto> findAll() {
        List<Customer> customerList=customerRepository.findAll();
        List<CustomerDto> customerDtoList=new ArrayList<>();
        for(Customer customer:customerList){
            customerDtoList.add(CustomerMapper.getCustomerDto(customer));
        }
        return customerDtoList;
    }
}
