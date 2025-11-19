package com.itshaala.springbootemployeecrud05.util;

import com.itshaala.springbootemployeecrud05.dto.EmployeeDto;
import com.itshaala.springbootemployeecrud05.entity.Employee;

public class EmployeeMapper {
    public static Employee getEmployee(EmployeeDto employeeDto) {
       return Employee.builder().id(employeeDto.getId()).name(employeeDto.getName()).phone(employeeDto.getPhone()).salary(employeeDto.getSalary()).address(employeeDto.getAddress()).email(employeeDto.getEmail()).build();
    }

    public static EmployeeDto getEmployeeDto(Employee employee) {
     return EmployeeDto.builder().id(employee.getId()).name(employee.getName()).phone(employee.getPhone()).salary(employee.getSalary()).address(employee.getAddress()).email(employee.getEmail()).build();
    }
}
