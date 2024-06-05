package com.investment.calculator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

@PostMapping("SimpleInterest")
public double simpleInterest(@RequestBody InvestmentCalculator calc){
    double interest= (calc.getPrinciple()*calc.getRate()*calc.getTime())/100;
    return interest;
}
@PostMapping("CompoundInterest")
public double compoundInterest(@RequestBody InvestmentCalculator calc){
    double interest= calc.getPrinciple()*(Math.pow((1+(calc.getRate()/calc.getYearFrequency())),calc.getYearFrequency()*calc.getTime())) -calc.getPrinciple();
    return interest;
}
    
}
