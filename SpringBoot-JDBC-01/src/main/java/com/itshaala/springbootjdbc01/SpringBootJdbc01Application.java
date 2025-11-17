package com.itshaala.springbootjdbc01;

import com.itshaala.springbootjdbc01.controller.StudentController;
import com.itshaala.springbootjdbc01.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class SpringBootJdbc01Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootJdbc01Application.class, args);
        StudentController controller = context.getBean(StudentController.class);
        Student student = new Student();
        student.setId(1);
        student.setName("suyash");
        student.setPhone("56789");
        student.setEmail("suyash@gmail.com");
      controller.addStudent(student);
    }

}
