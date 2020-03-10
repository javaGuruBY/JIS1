package by.jrr.abstracts;

import by.jrr.interfaces.Shape;

public class AbstractShape implements Shape {
    double radius;
    int height;
    int width;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
