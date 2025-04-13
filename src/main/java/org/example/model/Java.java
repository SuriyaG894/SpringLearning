package org.example.model;

import org.springframework.stereotype.Component;

@Component
public class Java implements Course{
    @Override
    public void courseName() {
        System.out.println("Java Course");
    }
}
