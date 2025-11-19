package com.itshaala.springbootemployeecrud05.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class EmployeeDto {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String salary;
}
