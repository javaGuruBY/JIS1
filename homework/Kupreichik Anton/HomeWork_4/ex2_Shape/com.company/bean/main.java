package com.company.bean;

import com.company.interfaces.Shape;
import com.company.service.Square;
import com.company.service.Triangle;
import com.company.service.Circle;

public class Main {

    public static void main(String[] args) {
        Shape[] shape =  new Shape[5];

        shape[0] = new Square("black", 15, "Square");
        shape[1] = new Circle("red", 5, "Circle");
        shape[2] = new Triangle("white", 12, 5, "Triangle");
        shape[3] = new Square("yellow", 10, "Square");
        shape[4] = new Circle("blue", 85, "Circle");

        for (int i = 0; i < shape.length; i++) {
            System.out.println((i+1) +". " + shape[i].getName() + " : " + shape[i].getArea());
        }
    }
}
