package by.jrr.children;

import by.jrr.parents.Mammal;

import java.util.Objects;

public class Dog extends Mammal {
    String subspecies;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(subspecies, dog.subspecies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subspecies);
    }

    @Override
    protected void voice() {
        System.out.println("Gaw!");
    }
}
