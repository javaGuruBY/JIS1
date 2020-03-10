package com.company.service;

import com.company.interfaces.MathOperation;

public class SubtractionOperation  implements MathOperation {

    @Override
    public double compute(double a, double b){
        System.out.println("Минус:");
    return (a-b);
    }

    @Override
    public String toString() {
        return "SubtractionOperation{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
