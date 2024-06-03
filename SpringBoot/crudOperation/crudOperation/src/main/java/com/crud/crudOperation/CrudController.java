package com.crud.crudOperation;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class CrudController {
  
    @GetMapping("/post")
    public String getString(){
        return "Post request";
    }
    
}
