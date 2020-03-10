package com.company.service;

import com.company.bean.OperationExecutor;
import com.company.interfaces.MathOperation;

public class DivisionOperation implements MathOperation {

    @Override
    public double compute(double a, double b) {
        System.out.println("Делить:");
        return (a/b);
    }

    @Override
    public String toString() {
        return "DivisionOperation{}";
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
