package by.jrr.figures;

import by.jrr.abstracts.AbstractShape;

public class Triangle extends AbstractShape {
    int firstSide;
    int secondSide;
    int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double getArea() {
        double halfMeter = (this.firstSide + this.secondSide + this.thirdSide) / 2;
        return Math.sqrt( halfMeter * (halfMeter - this.firstSide) * (halfMeter - this.secondSide) * (halfMeter - this.thirdSide));
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
