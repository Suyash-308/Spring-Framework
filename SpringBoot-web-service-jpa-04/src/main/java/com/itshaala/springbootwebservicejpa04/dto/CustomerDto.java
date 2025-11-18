package com.itshaala.springbootwebservicejpa04.dto;

import lombok.*;
import org.springframework.stereotype.Service;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CustomerDto {
    private int id;
    private String name;
    private String email;
    private String phone;
}
