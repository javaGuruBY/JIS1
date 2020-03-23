package bean;

import interfaces.Shape;

public abstract class AbstractShape implements Shape {
    String name;
    int numberOfCorners = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return 0;
    }

}
