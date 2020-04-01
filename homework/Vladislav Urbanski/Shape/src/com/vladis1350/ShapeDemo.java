package com.vladis1350;

import com.vladis1350.bean.Circle;
import com.vladis1350.bean.Square;
import com.vladis1350.bean.Triangle;
import com.vladis1350.interfaces.Shape;

public class ShapeDemo {

    static String getName(Shape shape) {
        return shape.getName();
    }

    static double getArea(Shape shape) {
        return shape.getArea();
    }

    public static void main(String[] args) {
        Shape circle = new Circle(17);
        Shape square = new Square(14.5d);
        Shape triangle = new Triangle(15.2d, 9.6d, 13.1d);

        System.out.println(getName(circle) + " " + getArea(circle));
        System.out.println(getName(square) + " " + getArea(square));
        System.out.println(getName(triangle) + " " + getArea(triangle));
    }

}
