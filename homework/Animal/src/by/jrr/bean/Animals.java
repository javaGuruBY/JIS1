package by.jrr.bean;

import java.util.Objects;

public class Animals {
    protected String race;

    public Animals() {
    }

    public Animals(String race) {
        this.race = race;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(race, animals.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(race);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "race='" + race + '\'' +
                '}';
    }
}

