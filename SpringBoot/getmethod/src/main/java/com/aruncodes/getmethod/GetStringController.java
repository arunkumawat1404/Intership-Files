package com.aruncodes.getmethod;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GetStringController {
    @GetMapping("/string")
    public String string1() {
        return "arun";
    }

}