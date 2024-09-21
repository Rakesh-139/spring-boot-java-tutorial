package com.rakeshrj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop Object Created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Desktop");
    }
}


