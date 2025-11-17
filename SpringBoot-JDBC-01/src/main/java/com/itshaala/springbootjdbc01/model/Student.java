package com.itshaala.springbootjdbc01.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
}
