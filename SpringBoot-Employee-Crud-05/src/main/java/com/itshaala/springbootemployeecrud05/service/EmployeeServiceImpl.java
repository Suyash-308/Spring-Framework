package com.itshaala.springbootemployeecrud05.service;

import com.itshaala.springbootemployeecrud05.dto.EmployeeDto;
import com.itshaala.springbootemployeecrud05.entity.Employee;
import com.itshaala.springbootemployeecrud05.exception.ResourceNotFoundException;
import com.itshaala.springbootemployeecrud05.repository.EmployeeRepository;
import com.itshaala.springbootemployeecrud05.util.EmployeeMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto create(EmployeeDto employeeDto) {
          Employee entity = EmployeeMapper.getEmployee(employeeDto);
          Employee savedEntity = employeeRepository.save(entity);
        return EmployeeMapper.getEmployeeDto(savedEntity);
    }

    @Override
    public EmployeeDto update(EmployeeDto employeeDto) {
       if (!employeeRepository.existsById(employeeDto.getId())) {
           throw new ResourceNotFoundException("Employee does not exist");
       }
       Employee updatedEntity =employeeRepository.save(EmployeeMapper.getEmployee(employeeDto));
        return EmployeeMapper.getEmployeeDto(updatedEntity);
    }

    @Override
    public void delete(int id) {
        if (!employeeRepository.existsById(id)) {
            throw new ResourceNotFoundException("Employee does not exist");
        }
        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeDto findById(int id) {
        Employee entity = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee does not exist"));
        return EmployeeMapper.getEmployeeDto(entity);
    }

    @Override
    public List<EmployeeDto> findAll() {
        List<Employee> entities = employeeRepository.findAll();
        return entities.stream().map(EmployeeMapper::getEmployeeDto).collect(Collectors.toList());
    }
}
