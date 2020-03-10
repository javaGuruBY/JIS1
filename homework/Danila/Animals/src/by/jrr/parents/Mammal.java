package by.jrr.parents;

import java.util.Objects;

public abstract class Mammal extends Animal {
    String breed;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(breed, mammal.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }

    @Override
    public String toString() {
        return "Mammal{}";
    }

    protected abstract void voice();
}
