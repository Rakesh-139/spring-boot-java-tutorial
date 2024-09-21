package com.example.rakesh139;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Starter {

    @GetMapping("/")
    public String getRoot(){
        System.out.println("Hited this API ________________________");
        return "Rakesh RJ";
    }
}
