package by.jrr.bean;

import java.util.Objects;

public class Mammal extends Animals {
    protected String nameMammal;

    public Mammal() {
    }

    public Mammal(String nameMammal) {
        this.nameMammal = nameMammal;
    }

    public Mammal(String race, String nameMammal) {
        super(race);
        this.nameMammal = nameMammal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(nameMammal, mammal.nameMammal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameMammal);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "nameMammal='" + nameMammal + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
