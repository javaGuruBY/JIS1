package bean;

public class Parrot extends Bird {

    public Parrot() {}

    @Override
    public String toString() {
        return "bean.Parrot " +
                "predator=" + predator +
                ", color='" + color + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", says='" + says;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
