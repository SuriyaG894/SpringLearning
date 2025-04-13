package org.example.model;

import java.beans.ConstructorProperties;

public class Alien {

//    private Laptop laptop;
    private Computer computer;
    private int age;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    @ConstructorProperties({"age","laptop"}) // while using this we need to specify the name in the constructor-arg tag.
//    Alien(int age,Laptop laptop){
//        this.age = age;
//        this.laptop = laptop;
//    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien()
    {
        System.out.println("Alien Object is created"+age);
    }

    public void code()
    {
        System.out.println("Coding....");
//        laptop.compile();
        computer.compile();
    }
}
