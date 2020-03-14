package service;

import interfaces.MathOperations;

public class Division implements MathOperations {
    @Override
    public double compute(double a, double b) {
        if (b == 0) {
            System.out.println("На ноль делить плохо. И нельзя. Но больше нельзя, чем плохо. " +
                    "Вот именно поэтому я верну 0");
            return 0;
        }
        return a / b;
    }

    @Override
    public String getName() {
        return "division";
    }


}
