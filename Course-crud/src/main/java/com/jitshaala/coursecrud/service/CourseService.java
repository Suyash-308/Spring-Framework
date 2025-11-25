package com.jitshaala.coursecrud.service;

import com.jitshaala.coursecrud.dto.CourseDto;

import java.util.List;

public interface CourseService {
    CourseDto create(CourseDto courseDto);
    void deleteById(int id);
    CourseDto update(CourseDto courseDto);
    CourseDto getCourseById(int id);
    List<CourseDto> getAllCourse();
}
