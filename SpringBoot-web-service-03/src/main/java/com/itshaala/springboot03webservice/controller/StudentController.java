package com.itshaala.springboot03webservice.controller;

import com.itshaala.springboot03webservice.model.Student;
import com.itshaala.springboot03webservice.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/student")
@RestController
@AllArgsConstructor

public class StudentController {
    StudentService studentService;

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @PutMapping
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/{id}")
   public ResponseEntity<Student> deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
        return ResponseEntity.notFound().build();
   }

   @GetMapping("/{id}")
   public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
   }

   @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }



}
