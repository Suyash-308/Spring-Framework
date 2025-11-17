package com.itshaala.springbootjdbc01.controller;


import com.itshaala.springbootjdbc01.model.Student;
import com.itshaala.springbootjdbc01.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;


    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentService.updateStudent(student);
    }

    public void deleteStudent(int id) {
            studentService.deleteStudent(id);
    }



    public Student getStudent(int id) {
        return studentService.getStudent(id);
    }
   }
