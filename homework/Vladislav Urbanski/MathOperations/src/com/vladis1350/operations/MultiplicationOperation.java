package com.vladis1350.operations;

import com.vladis1350.interfaces.MathOperation;

public class MultiplicationOperation implements MathOperation {
    @Override
    public double compute(double a, double b) {
        System.out.println("Multiplication: ");
        return a * b;
    }
}
