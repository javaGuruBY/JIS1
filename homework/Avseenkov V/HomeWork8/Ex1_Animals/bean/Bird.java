package bean;

public class Bird extends Animal {
    boolean predator;

    @Override
    public String toString() {
        return "bean.Bird " +
                "predator=" + predator +
                ", color='" + color + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", says='" + says;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return predator == bird.predator;
    }
}
