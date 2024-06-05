package com.form.webpage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/api")
public class FormController {

   

    @GetMapping("/form")
    public String form(){
        return "form";
    }
    
    @PostMapping("/submit")
    public String postMethodName(@RequestParam("name") String name,
                                @RequestParam("email") String email,
                                @RequestParam("phone")  int phone , 
                                Model model) {

        model.addAttribute("name" , name);
        model.addAttribute("email" , email);
        model.addAttribute("phone" , phone);

        
        return "userDetails";
    }
    @GetMapping("/userDetails")
    public String getMethod() {
        return "userDetails";
    }
    
    
    

    
}
