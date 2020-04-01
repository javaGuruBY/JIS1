package by.jrr.figures;

import by.jrr.abstracts.AbstractShape;

public class Square extends AbstractShape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String getName() {
        return "Square";
    }
}
