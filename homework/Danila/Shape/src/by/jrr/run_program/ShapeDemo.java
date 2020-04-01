package by.jrr.run_program;

import by.jrr.figures.Circle;
import by.jrr.figures.Square;
import by.jrr.figures.Triangle;
import by.jrr.interfaces.Shape;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        shape[0] = new Circle(3);
        shape[1] = new Square(5);
        shape[2] = new Triangle(3, 4, 5);

        for (Shape shapes: shape) {
            System.out.println(shapes.getArea() + " : " + shapes.getName());
        }
    }
}
