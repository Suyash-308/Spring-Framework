package com.jitshaala.coursecrud.entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

@Entity
@Builder
@Table(name = "course_tbl")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "duration")
    private String duration;

    @Column(name = "price")
    private double price;

}
