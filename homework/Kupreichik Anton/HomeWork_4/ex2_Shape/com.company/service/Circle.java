package com.company.service;

public class Circle extends AbstractShape {
    private String color;
    private int radius;

    public Circle(String color, int radius, String name){
        super(name);
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }


    public String getColor() {
        return color;
    }

    @Override
    public double getArea(){
        return (2* 3.14 * radius);
    }

    @Override
    public String getName() {
        return "Cicrle";
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }


}
