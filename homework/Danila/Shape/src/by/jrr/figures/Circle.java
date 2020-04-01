package by.jrr.figures;

import by.jrr.abstracts.AbstractShape;

public class Circle extends AbstractShape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
