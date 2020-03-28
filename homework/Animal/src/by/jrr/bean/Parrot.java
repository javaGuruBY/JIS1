package by.jrr.bean;

import java.util.Objects;

public class Parrot extends Bird {
    private String nameParrot;

    public Parrot() {
    }

    public Parrot(String nameParrot) {
        this.nameParrot = nameParrot;
    }

    public Parrot(String race, String nameBird, String nameParrot) {
        super(race, nameBird);
        this.nameParrot = nameParrot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(nameParrot, parrot.nameParrot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameParrot);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "nameParrot='" + nameParrot + '\'' +
                ", nameBird='" + nameBird + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
