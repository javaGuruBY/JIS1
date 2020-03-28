package by.jrr.bean;

import java.util.Objects;

public class Dog extends Mammal {
    private String nameDog;

    public Dog() {
    }

    public Dog(String nameDog) {
        this.nameDog = nameDog;
    }

    public Dog(String race, String nameMammal, String nameDog) {
        super(race, nameMammal);
        this.nameDog = nameDog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(nameDog, dog.nameDog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameDog);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nameDog='" + nameDog + '\'' +
                ", nameMammal='" + nameMammal + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
