package com.aruncodes.getmethod;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GetSquareController {
    @GetMapping("/square")
    public int sqaure(@RequestParam int n) {
        return n * n;
    }
    @GetMapping("/myweb")
    public String myWeb(@RequestParam String name) {
        return new String("<html><body><h1>This is My Web</h1><br/><p>Printing my name: " + name + " </p></body><html>");
    }

}
