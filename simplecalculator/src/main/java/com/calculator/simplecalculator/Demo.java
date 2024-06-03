package com.calculator.simplecalculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @GetMapping("/demo")
    public String seeDemo(){
        return "on web";
    }
    
}
