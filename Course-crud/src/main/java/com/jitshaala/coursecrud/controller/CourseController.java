package com.jitshaala.coursecrud.controller;

import com.jitshaala.coursecrud.dto.CourseDto;
import com.jitshaala.coursecrud.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;



@RestController
@RequestMapping("/api/course")
@AllArgsConstructor
@Transactional

public class CourseController {
private final CourseService courseService;
    @PostMapping
     ResponseEntity<CourseDto> create(@RequestBody CourseDto courseDto) {
        CourseDto entity = courseService.create(courseDto);
        return ResponseEntity.created(URI.create("/api/course" +entity.getId())).body(entity);
    }

    @PutMapping
    ResponseEntity<CourseDto> update(@RequestBody CourseDto courseDto) {
        CourseDto entity = courseService.update(courseDto);
        return ResponseEntity.ok().body(entity);
    }

    @DeleteMapping("/{id}")
     ResponseEntity<Void> delete(@PathVariable int id) {
        courseService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseDto> findById(@PathVariable int id) {
        CourseDto courseDto = courseService.getCourseById(id);
        return ResponseEntity.ok().body(courseDto);
    }

    @GetMapping
    ResponseEntity<List<CourseDto>> findAll() {
        List<CourseDto> courses = courseService.getAllCourse();
        return ResponseEntity.ok().body(courses);
    }
}
