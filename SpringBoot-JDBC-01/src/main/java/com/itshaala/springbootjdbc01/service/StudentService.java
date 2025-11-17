package com.itshaala.springbootjdbc01.service;

import com.itshaala.springbootjdbc01.dao.StudentDao;
import com.itshaala.springbootjdbc01.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentDao studentDao;
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }



    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }
}
