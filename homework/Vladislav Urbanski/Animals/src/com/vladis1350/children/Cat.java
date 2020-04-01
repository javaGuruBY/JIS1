package com.vladis1350.children;

import com.vladis1350.parent.Mammal;

public class Cat extends Mammal {
    private String name;
    private String color;
    private int age;

    public Cat() {
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void activity() {
        System.out.println("is playing");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("MEOW!");
    }

    @Override
    public void eat() {
        System.out.println("Kitekat and Whiskas");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
