package com.jitshaala.coursecrud.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString

public class CourseDto {
    private Integer id;
    private String name;
    private String description;
    private double price;
    private String duration;
}
