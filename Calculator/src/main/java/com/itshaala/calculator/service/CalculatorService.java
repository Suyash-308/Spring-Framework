package com.itshaala.calculator.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CalculatorService {

    public  double add(double a,double b){
        return a+b;
    }

    public  double  subtract(double a,double b){
        return a-b;
    }

    public  double  multiply(double a,double b){
        return a*b;
    }

    public  double  divide(double a,double b){
        if(b==0){
            System.out.println("Arithmetic Exception Division By Zero");
        }
        return a/b;
    }



}
