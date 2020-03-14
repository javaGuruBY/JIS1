package bean;

import java.util.Objects;

public class Animal {
    protected String color;
    protected int numberOfLegs;
    protected String says;

    @Override
    public String toString() {
        return "bean.Animal " +
                "color='" + color + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", says='" + says;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return numberOfLegs == animal.numberOfLegs &&
                color.equals(animal.color) &&
                Objects.equals(says, animal.says);
    }
}
