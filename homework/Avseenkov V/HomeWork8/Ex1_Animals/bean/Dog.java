package bean;

import java.io.Serializable;

public class Dog extends Mammal implements Serializable {

    public Dog() {}

    @Override
    public void voice() {
        System.out.println("Woof-woof");
    }

    @Override
    public String toString() {
        return "bean.Dog " +
                "breath=" + breath +
                ", color='" + color + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", says='" + says;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
