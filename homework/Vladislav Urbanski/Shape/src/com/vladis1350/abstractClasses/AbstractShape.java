package com.vladis1350.abstractClasses;

import com.vladis1350.interfaces.Shape;

public abstract class AbstractShape implements Shape {

    protected String name;
    protected double pi = 3.1415;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
