package com.itshaala.calculator.controller;

import com.itshaala.calculator.service.CalculatorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
@AllArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @PostMapping("/add")
    public  double add(@RequestParam double a,@RequestParam double b){
        return calculatorService.add(a,b);
    }

    @PostMapping("/subtract")
    public  double subtract(@RequestParam  double a,@RequestParam  double b){
        return calculatorService.subtract(a,b);
    }

    @PostMapping("/multiply")
    public  double multiply(@RequestParam  double a,@RequestParam double b){
        return calculatorService.multiply(a,b);
    }

    @PostMapping("/divide")
    public  double divide(@RequestParam  double a,@RequestParam double b){
        return calculatorService.divide(a,b);
    }



}
