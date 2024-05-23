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

}
