package com.itshaala.springbootemployeecrud05.repository;

import com.itshaala.springbootemployeecrud05.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
