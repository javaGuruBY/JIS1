package com.vladis1350.children;

import com.vladis1350.parent.Mammal;

import java.util.Objects;

public class Dog extends Mammal {
    private String name;
    private String color;
    private int age;

    public Dog() {
    }

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void activity() {
        System.out.println("Lies of the floor");
    }

    @Override
    public void voice() {
        System.out.println("WOOF");
    }

    @Override
    public void eat() {
        System.out.println("Meat om nom nom");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
