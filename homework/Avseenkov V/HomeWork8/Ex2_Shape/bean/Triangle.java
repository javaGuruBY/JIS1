package bean;

public class Triangle extends AbstractShape {
    protected double triangleHeight;
    protected double triangleWidth;

    public Triangle(double triangleHeight, double triangleWidth) {
        this.triangleHeight = triangleHeight;
        this.triangleWidth = triangleWidth;
        this.name = "Triangle";
        this.numberOfCorners = 3;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return (triangleHeight * triangleWidth) / 2;
    }
}
