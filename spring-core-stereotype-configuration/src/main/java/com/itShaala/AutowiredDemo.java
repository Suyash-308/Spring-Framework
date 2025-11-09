package com.itShaala;

import com.itShaala.configuration.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredDemo {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        StudentController studentController = context.getBean(StudentController.class);
        studentController.addStudent();
    }
}
