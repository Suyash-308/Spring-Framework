package com.itshaala.springbootwebservicejpa04.controller;

import com.itshaala.springbootwebservicejpa04.dto.CreateCustomerRequestDto;
import com.itshaala.springbootwebservicejpa04.dto.CustomerDto;
import com.itshaala.springbootwebservicejpa04.model.Customer;
import com.itshaala.springbootwebservicejpa04.service.CustomerService;
import com.itshaala.springbootwebservicejpa04.util.CustomerMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController {
   private CustomerService customerService;

   @PostMapping
    ResponseEntity<CustomerDto> create(@RequestBody CreateCustomerRequestDto createCustomerRequestDto) {
         CustomerDto customerDto = customerService.create(createCustomerRequestDto);
         return ResponseEntity.ok().body(customerDto);
    }

    @PutMapping("/{id}")
    ResponseEntity<CustomerDto> update(@PathVariable("id") int id,@RequestBody CreateCustomerRequestDto createCustomerRequestDto) {
         CustomerDto customerDto=customerService.update(id, createCustomerRequestDto);
         return  ResponseEntity.ok().body(customerDto);
    }

 @DeleteMapping("/{id}")
    ResponseEntity<Void>delete(@PathVariable("id") int id) {
           customerService.delete(id);
           return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public CustomerDto findById(@PathVariable("id") int id) {
          return   customerService.findById(id);
    }

    @GetMapping
    public List<CustomerDto> findAll() {
       return customerService.findAll();
    }
}
