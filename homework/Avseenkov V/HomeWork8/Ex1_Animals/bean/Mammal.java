package bean;

public abstract class Mammal extends Animal {
    public boolean breath;

    public Mammal() {}

    public boolean isBreath() {
        return breath;
    }

    public void setBreath(boolean breath) {
        this.breath = breath;
    }

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
