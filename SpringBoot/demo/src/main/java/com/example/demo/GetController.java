package com.example.demo;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class GetController {
    @GetMapping("/square")
    public int getSquare(@RequestParam int num) {
        return num*num;
    }
    
    // public String square(){
    //     return "arun";
    // }
    
}
