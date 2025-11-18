package com.itshaala.springboot03webservice.service;

import com.itshaala.springboot03webservice.dao.StudentDao;
import com.itshaala.springboot03webservice.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentDao studentDao;


    public void addStudent(Student student){
        studentDao.addStudent(student);
    }

    public void updateStudent(Student student){
        studentDao.updateStudent(student);
    }

    public void deleteStudent(int id){
        studentDao.deleteStudent(id);
    }

    public Student getStudentById(int id){
        return studentDao.getStudentById(id);
    }

    public List<Student> getAllStudents(){
       return studentDao.getAllStudents();
    }

}
