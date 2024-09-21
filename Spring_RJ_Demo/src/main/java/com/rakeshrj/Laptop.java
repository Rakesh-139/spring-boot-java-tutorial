package com.rakeshrj;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Computing....");
    }
   @Override
    public void compile(){
       System.out.println("Compiling using Laptop");
    }
}
