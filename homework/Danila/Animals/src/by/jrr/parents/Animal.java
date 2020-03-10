package by.jrr.parents;

import java.util.Objects;

public class Animal {
    protected String breed;
    protected String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(breed, animal.breed) &&
                Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, color);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
