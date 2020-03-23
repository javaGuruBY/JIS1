package bean;

public class Square extends AbstractShape {
    protected double legthOfSide;

    public Square(double legthOfSide) {
        this.legthOfSide = legthOfSide;
        this.name = "square";
        this.numberOfCorners = 4;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return Math.pow(legthOfSide, 2);
    }
}
