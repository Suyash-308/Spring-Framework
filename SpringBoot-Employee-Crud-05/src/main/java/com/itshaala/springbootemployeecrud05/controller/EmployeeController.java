package com.itshaala.springbootemployeecrud05.controller;

import com.itshaala.springbootemployeecrud05.dto.EmployeeDto;
import com.itshaala.springbootemployeecrud05.repository.EmployeeRepository;
import com.itshaala.springbootemployeecrud05.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping
    ResponseEntity<EmployeeDto> create(@RequestBody EmployeeDto employeeDto){
       EmployeeDto savedEmployeeDto =employeeService.create(employeeDto);
       return ResponseEntity.created(URI.create("/api/employees"+ savedEmployeeDto.getId())).body(savedEmployeeDto);
    }

    @PutMapping
    ResponseEntity<EmployeeDto> update(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployeeDto =employeeService.update(employeeDto);
        return ResponseEntity.ok().body(savedEmployeeDto);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable int id){
        employeeService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    ResponseEntity<EmployeeDto> findById (@PathVariable int id){
        EmployeeDto employeeDto =employeeService.findById(id);
        return ResponseEntity.ok().body(employeeDto);
    }

    @GetMapping
    ResponseEntity<List<EmployeeDto>>  findAll(){
        List<EmployeeDto> employeeDto =employeeService.findAll();
        return ResponseEntity.ok().body(employeeDto);
    }
}
