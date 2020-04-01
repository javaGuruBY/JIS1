package com.vladis1350.operations;

import com.vladis1350.interfaces.MathOperation;

public class DivisionOperation implements MathOperation {
    @Override
    public double compute(double a, double b) {
        if (b == 0) {
            return -1;
        }
        System.out.println("Division: ");
        return a / b;
    }
}
