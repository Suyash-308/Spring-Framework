package com.itShaala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    void addStudent() {
        studentDao.addStudent();
    }
}
