package bean;

public abstract class Mammal extends Animal {
    boolean breath;

    protected abstract void voice();

    @Override
    public String toString() {
        return "mammal{}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammal)) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return breath == mammal.breath;
    }

}
