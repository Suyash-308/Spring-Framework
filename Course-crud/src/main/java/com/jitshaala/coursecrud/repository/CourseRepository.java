package com.jitshaala.coursecrud.repository;

import com.jitshaala.coursecrud.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {

}
