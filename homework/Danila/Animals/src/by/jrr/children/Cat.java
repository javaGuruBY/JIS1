package by.jrr.children;

import by.jrr.parents.Mammal;

public class Cat extends Mammal {
    String subspecies;

    @Override
    public void voice() {
        System.out.println("May");
    }
}
