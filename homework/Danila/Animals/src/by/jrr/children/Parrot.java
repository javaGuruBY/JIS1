package by.jrr.children;

import java.util.Objects;

public class Parrot extends Bird {
    String subspecies;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(subspecies, parrot.subspecies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subspecies);
    }

    @Override
    protected void fly() {
        System.out.println("I'm flying");
    }
}
