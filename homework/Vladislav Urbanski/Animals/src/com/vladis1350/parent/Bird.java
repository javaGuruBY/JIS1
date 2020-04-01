package com.vladis1350.parent;

import java.util.Objects;

public abstract class Bird extends Animal {
    protected String color;
    protected boolean migratory;

    protected abstract void voice();
    protected abstract void fly();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return migratory == bird.migratory &&
                Objects.equals(color, bird.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, migratory);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "color='" + color + '\'' +
                ", migratory=" + migratory +
                "} " + super.toString();
    }
}
