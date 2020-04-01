package com.vladis1350.bean;

import com.vladis1350.abstractClasses.AbstractShape;

public class Square extends AbstractShape {

    double diagonal;

    public Square(double diagonal) {
        name = "Square";
        this.diagonal = diagonal;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return 0.5 * diagonal * diagonal;
    }
}
