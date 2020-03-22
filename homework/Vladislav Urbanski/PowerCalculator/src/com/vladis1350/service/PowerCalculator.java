package com.vladis1350.service;

public class PowerCalculator {

    public int exponentiation(int number, int power) {
        int independentVariable = number;
        if (number >= 0) {
            for (int i = 1; i < power; i++) {
                number *= independentVariable;
            }
        }
        return number;
    }

}
