package com.vladis1350.operations;

import com.vladis1350.interfaces.MathOperation;

public class AdditionOperation implements MathOperation {
    @Override
    public double compute(double a, double b) {
        System.out.println("Addition: ");
        return a + b;
    }
}
