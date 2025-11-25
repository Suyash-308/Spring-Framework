package com.jitshaala.coursecrud.util;

import com.jitshaala.coursecrud.dto.CourseDto;
import com.jitshaala.coursecrud.entity.Course;

public class CourseMapper {
    public static Course getCourse(CourseDto courseDto){
        return Course.builder().id(courseDto.getId()).name(courseDto.getName()).description(courseDto.getDescription()).duration(courseDto.getDuration()).price(courseDto.getPrice()).build();
    }
    public static CourseDto getCourseDto(Course course){
        return CourseDto.builder().id(course.getId()).name(course.getName()).description(course.getDescription()).duration(course.getDuration()).price(course.getPrice()).build();
    }
}
