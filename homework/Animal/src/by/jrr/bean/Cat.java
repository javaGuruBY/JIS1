package by.jrr.bean;

import java.util.Objects;

public class Cat extends Mammal {
    private String nameCat;

    public Cat() {
    }

    public Cat(String nameCat) {
        this.nameCat = nameCat;
    }

    public Cat(String race, String nameMammal, String nameCat) {
        super(race, nameMammal);
        this.nameCat = nameCat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(nameCat, cat.nameCat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameCat);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nameCat='" + nameCat + '\'' +
                ", nameMammal='" + nameMammal + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
