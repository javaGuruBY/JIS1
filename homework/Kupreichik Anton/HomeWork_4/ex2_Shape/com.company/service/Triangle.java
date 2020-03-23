package com.company.service;

public class Triangle extends AbstractShape {
    private String color;
    private int base, height;

    public Triangle(String color, int base, int height, String name){
        super(name);
        this.base = base;
        this.height = height;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea(){
        return (0.5 *height * base);
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
