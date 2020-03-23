package com.company.service;

import com.company.interfaces.Shape;

public abstract class AbstractShape implements Shape {

    public String name;
    public double area;

    AbstractShape(String name){
        this.name = name;
    }

}
