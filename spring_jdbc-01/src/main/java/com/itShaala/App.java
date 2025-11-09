package com.itShaala;

import com.itShaala.configuration.SpringConfiguration;
import com.itShaala.controller.StudentController;
import com.itShaala.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        StudentController studentController = context.getBean(StudentController.class);
        Student student = new Student(1, "shyam", "shyam@gmail.com", "123456");
        System.out.println(studentController.getStudent(2));
    }
}
