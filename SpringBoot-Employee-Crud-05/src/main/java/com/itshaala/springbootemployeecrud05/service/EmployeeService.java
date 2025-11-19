package com.itshaala.springbootemployeecrud05.service;

import com.itshaala.springbootemployeecrud05.dto.EmployeeDto;
import com.itshaala.springbootemployeecrud05.entity.Employee;

import java.util.List;

public interface EmployeeService {
        EmployeeDto create(EmployeeDto employeeDto);
        EmployeeDto  update(EmployeeDto employeeDto);
        void delete(int id);
        EmployeeDto findById(int id);
        List<EmployeeDto> findAll();
}
