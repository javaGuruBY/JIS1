package com.vladis1350.lambdasApp;

import java.util.function.BinaryOperator;

public class BinaryOperatorClass {

    public static double binaryOperatorMethod(double a, double b) {
        BinaryOperator<Double> division = (x, y) -> a / b;
        BinaryOperator<Double> multiply = (x, y) -> a * b;
        double resultDivision = division.apply(a, b);
        double resultMultiply = multiply.apply(a, b);
        BinaryOperator<Double> addition = (x, y) -> resultDivision + resultMultiply;
        return addition.apply(resultDivision, resultMultiply);
    }
}
