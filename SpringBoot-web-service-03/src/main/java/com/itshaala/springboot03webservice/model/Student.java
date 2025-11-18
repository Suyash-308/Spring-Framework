package com.itshaala.springboot03webservice.model;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor @Setter
@Getter @ToString
public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
}
