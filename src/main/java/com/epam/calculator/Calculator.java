package com.epam.calculator;

public class Calculator {
    public int add(int first, int second) {
        return first + second;
    }

    public int subtract(int first, int second){
        return first - second;
    }

    public int multiply(int first, int second){
        return first * second;
    }

    public int divide(int first, int second){
        return first / second;
    }

    public int pow(int first, int second){
        return (int) Math.pow(first,second);
    }

}
