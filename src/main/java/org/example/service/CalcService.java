package org.example.service;

import org.springframework.stereotype.Component;

@Component
public class CalcService {

    public static double Addition (double num1,double num2){
        return num1+num2;
    }
    public static double Subtraction (double num1,double num2){
        return num1-num2;
    }
    public static double Multiplication (double num1,double num2){
        return num1*num2;
    }
    public static double Division (double num1,double num2){
        return num1/num2;
    }
}
