package by.jrr.children;

import by.jrr.parents.Animal;

import java.util.Objects;

public abstract class Bird extends Animal {
    String subspecies;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(subspecies, bird.subspecies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subspecies);
    }

    @Override
    public String toString() {
        return "Bird{}";
    }

    protected abstract void fly();
}
