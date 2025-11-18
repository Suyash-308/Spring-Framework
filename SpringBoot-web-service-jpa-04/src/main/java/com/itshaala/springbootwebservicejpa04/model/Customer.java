package com.itshaala.springbootwebservicejpa04.model;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor @NoArgsConstructor @Setter @Getter @ToString
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private int id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "email",unique = true,nullable = false)
    private String email;

    @Column(name = "phone")
    private String phone;
}
