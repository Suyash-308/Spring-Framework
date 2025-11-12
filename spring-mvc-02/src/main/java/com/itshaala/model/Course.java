package com.itshaala.model;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString

public class Course {
    int id;
    String name;
    String duration;
    int price;
}
