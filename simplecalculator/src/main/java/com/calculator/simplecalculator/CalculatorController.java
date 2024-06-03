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
        double result = 0;
        switch (calc.getOperation()) {
            case "add":
                result = calc.getNum1() + calc.getNum2();
                break;
            case "subtract":
                result = calc.getNum1() - calc.getNum2();
                break;
            case "multiply":
                result = calc.getNum1() * calc.getNum2();
                break;
        }
        model.addAttribute("result", result);

        
        return "calculator";
    }
    
    

}
