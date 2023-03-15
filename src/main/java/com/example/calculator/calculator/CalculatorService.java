package com.example.calculator.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }


    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }


    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }


    public String divide(int num1, int num2) {
        if (num2 == 0){
            return "Деление на 0 невозможно!";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
