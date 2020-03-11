package com.vladis1350.parent;

import java.util.Objects;

public class Animal {
    protected String classification;

    public Animal() {
    }

    public Animal(String classification) {
        this.classification = classification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(classification, animal.classification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classification);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "classification='" + classification + '\'' +
                '}';
    }
}
