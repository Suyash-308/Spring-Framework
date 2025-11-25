package com.jitshaala.coursecrud.service;

import com.jitshaala.coursecrud.dto.CourseDto;
import com.jitshaala.coursecrud.entity.Course;
import com.jitshaala.coursecrud.exception.ResourceNotFoundException;
import com.jitshaala.coursecrud.repository.CourseRepository;
import com.jitshaala.coursecrud.util.CourseMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
@AllArgsConstructor
public class CourseServiceImp implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public CourseDto create(CourseDto courseDto) {
        Course course = CourseMapper.getCourse(courseDto);
        Course saved = courseRepository.save(course);
        return CourseMapper.getCourseDto(saved);
    }

    @Override
    public void deleteById(int id) {
        if (!courseRepository.existsById(id)) {
            throw new ResourceNotFoundException("Course does not exist");
        }
        courseRepository.deleteById(id);
    }

    @Override
    public CourseDto update(CourseDto courseDto) {
        if (!courseRepository.existsById(courseDto.getId())) {
            throw new ResourceNotFoundException("Course does not exist");
        }
        Course updated = courseRepository.save(CourseMapper.getCourse(courseDto));
        return CourseMapper.getCourseDto(updated);
    }

    @Override
    public CourseDto getCourseById(int id) {
        Course course = courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course does not exist"));
        return CourseMapper.getCourseDto(course);
    }

    @Override
    public List<CourseDto> getAllCourse() {
        List<Course> courses = courseRepository.findAll();
        return courses.stream().map(CourseMapper::getCourseDto).collect(Collectors.toList());
    }
}
