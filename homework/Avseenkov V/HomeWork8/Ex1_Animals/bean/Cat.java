package bean;

import java.io.Serializable;

public class Cat extends Mammal implements Serializable {

    public Cat() {}

    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "bean.Cat " +
                "breath=" + breath +
                ", color='" + color + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", says='" + says;
    }
}
