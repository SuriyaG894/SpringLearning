package org.example.model;

public class Laptop implements Computer{

    public Laptop(){
        System.out.println("Laptop Created");
    }

    public void compile() {
        System.out.println("Compiling");
    }
}
