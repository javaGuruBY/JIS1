package by.jrr.bean;

import java.util.Objects;

public class Bird extends Animals {
    protected String nameBird;

    public Bird() {
    }

    public Bird(String nameBird) {
        this.nameBird = nameBird;
    }

    public Bird(String race, String nameBird) {
        super(race);
        this.nameBird = nameBird;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(nameBird, bird.nameBird);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameBird);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "nameBird='" + nameBird + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
