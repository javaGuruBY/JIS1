package by.jrr.service;

import by.jrr.interfaces.MathOperation;

public class DivisionOperation implements MathOperation {
    @Override
    public double compute(double a, double b) {
        return a / b;
    }

    @Override
    public String getName() {
        return "Division";
    }
}
