package com.vladis1350.bean;

import com.vladis1350.abstractClasses.AbstractShape;

public class Triangle extends AbstractShape {

    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        name = "Triangle";
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        double perimeter;
        double area;
        if (((sideA + sideB) < sideC) || ((sideB + sideC) < sideA) || ((sideC + sideA) < sideB)) {
            return 0.0;
        }
        perimeter = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
        return area;
    }
}
