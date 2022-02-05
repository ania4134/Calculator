package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;

public class Calculator {
    double number1;
    double number2;


    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double addition() {
        return number1 + number2;
    }

    public double subtraction() {
        return number1 - number2;
    }

    public static void main(String args[]) {


        Calculator calculator = new Calculator(5.4, 9.7);

        System.out.println(calculator.addition());
        System.out.println(calculator.subtraction());
    }
}