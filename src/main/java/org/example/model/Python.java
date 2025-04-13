package org.example.model;

import org.springframework.stereotype.Component;

@Component
public class Python implements Course{

    @Override
    public void courseName() {
        System.out.println("Python Course");
    }
}
