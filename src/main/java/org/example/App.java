package org.example;

import org.example.model.Alien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        Alien alien = (Alien)context.getBean("alien");
        alien.code();
        System.out.println( "Hello World!" );
    }
}
