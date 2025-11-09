package com.itShaala.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
@Scope("prototype")
@PropertySource("classpath*:application.properties")
public class Employee {
    @Value("$(employee.id)")
    private int id;

    @Value("$(employee.name)")
    private String name;

    @Value("$(employee.salary)")
    private double salary;

}
