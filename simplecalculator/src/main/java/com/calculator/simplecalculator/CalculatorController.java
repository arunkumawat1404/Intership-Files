package com.calculator.simplecalculator;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.Model;

//import com.calculator.simplecalculator.Calculator;


@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    @ModelAttribute("calculate")
    public Calculator  calculate(){
        return new Calculator();
    }

    @GetMapping
    public String getparams(){
        return "calculator";
    }
    
    @PostMapping
    public String returnresult(@ModelAttribute("calculate") Calculator calc , Model model) {
        double add = calc.getNum1() + calc.getNum2();
        double subtract = calc.getNum1()  - calc.getNum2();
        double multiply = calc.getNum1()*calc.getNum2();
       // double subtract = calc.getNum1() + calc.getNum2();
        model.addAttribute("add" , add);
        model.addAttribute("subtract" , subtract);
        model.addAttribute("multiply" , multiply);

        
        return "calculator";
    }
    
    

}
