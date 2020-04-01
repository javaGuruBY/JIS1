package com.vladis1350.parent;

import java.util.Objects;

public abstract class Mammal extends Animal {
    protected int numberOfPaws;
    protected int runningSpeed;

    protected void activity() {
        System.out.println("sleep");
    }

    protected abstract void voice();
    protected abstract void eat();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return numberOfPaws == mammal.numberOfPaws &&
                runningSpeed == mammal.runningSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPaws, runningSpeed);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "numberOfPaws=" + numberOfPaws +
                ", runningSpeed=" + runningSpeed +
                "} " + super.toString();
    }
}
