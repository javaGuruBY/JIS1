package com.vladis1350.operations;

import com.vladis1350.interfaces.MathOperation;

public class SubtractionOperation implements MathOperation {

    @Override
    public double compute(double a, double b) {
        System.out.println("Subtraction: ");
        return a - b;
    }
}
