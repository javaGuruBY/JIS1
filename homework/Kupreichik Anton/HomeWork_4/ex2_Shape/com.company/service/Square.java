package com.company.service;

public class Square extends AbstractShape {
    private String color;
    private int side;

    public Square(String color, int side, String name){
        super(name);
        this.color =color;
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public int getSide() {
        return side;
    }
    @Override
    public double getArea(){
        return (side * side);
    }

    @Override
    public String getName() {
        return "Square";
    }
}
