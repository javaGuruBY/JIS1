package com.vladis1350.children;

import com.vladis1350.parent.Bird;

import java.util.Objects;

public class Parrot extends Bird {
    private String name;

    public Parrot() {
    }

    public Parrot(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Kesha is good! Kesha is good!");
    }

    @Override
    public void fly() {
        System.out.println("I believe i can fly!");
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(color, parrot.color) &&
                Objects.equals(name, parrot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, name);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
