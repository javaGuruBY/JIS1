package by.jrr.test;

import by.jrr.bean.*;

public class Test {
    public static void main(String[] args) {
        Animals animals = new Animals("Mammal");
        Mammal mammal = new Mammal("Tetrapods");

        Cat cat = new Cat("Barsik");
        Dog dog = new Dog("Pushok");

        Bird bird = new Bird("Parrot");
        Parrot parrot = new Parrot("Gosha");

        System.out.println(animals.toString());
        System.out.println(mammal.toString());
        System.out.println(bird.toString());

        System.out.println();

        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println(parrot.toString());
    }
}
