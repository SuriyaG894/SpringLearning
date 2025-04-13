package org.example;

import org.example.config.AppConfig;
import org.example.config.ComponentScanConfig;
import org.example.model.Alien;
import org.example.model.Desktop;
import org.example.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Using ComponentScan
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        Student student= (Student)context.getBean("student");
        student.takeCourse();
        // Without using ComponentScan
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop desktop = (Desktop) context.getBean("com2");
//        Alien alien = (Alien) context.getBean("alien");
//        alien.code();
//        desktop.compile();



        // XML Configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
//        Alien alien = (Alien)context.getBean("alien");
//        alien.code();
//        System.out.println( "Hello World!" );
    }
}
