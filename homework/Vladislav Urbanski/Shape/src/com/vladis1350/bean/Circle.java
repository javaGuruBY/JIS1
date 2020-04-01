package com.vladis1350.bean;

import com.vladis1350.abstractClasses.AbstractShape;

public class Circle extends AbstractShape {
    private int radius;

    public Circle(int radius) {
        name = "Circle";
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }
}
