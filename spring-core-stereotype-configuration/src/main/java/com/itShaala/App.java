package com.itShaala;

import com.itShaala.configuration.SpringConfiguration;
import com.itShaala.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Employee employee1 = context.getBean("employee", Employee.class);
        System.out.println(employee1);
    }
}
