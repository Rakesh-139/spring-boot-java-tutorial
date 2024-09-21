package com.rakeshrj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

import static java.awt.SystemColor.desktop;
@Component
public class Alien {
@Value("24")
    private int age ;
    @Autowired
  @Qualifier("laptop")
    private Computer com;

    public Alien() {
        System.out.println("Alien Object Created");
    }

//    @ConstructorProperties({"age", "lap"})
//    public Alien(int age, Computer com) {
//        this.age = age;
//        this.com = com;
//   }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       // System.out.println("Settler called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding");
           com.compile();

    }
}

