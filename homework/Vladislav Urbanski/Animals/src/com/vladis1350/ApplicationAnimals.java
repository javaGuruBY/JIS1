package com.vladis1350;

import com.vladis1350.children.Cat;
import com.vladis1350.children.Dog;
import com.vladis1350.children.Parrot;

public class ApplicationAnimals {
    public static void main(String[] args) {
        Cat catMyrzik = new Cat("Myrzik", "Black", 2);
        Dog dogBarbos = new Dog("Barbos","Redhead", 2);
        Parrot birdKesha = new Parrot("Kesha");

        System.out.println(catMyrzik.toString());
        catMyrzik.activity();

        System.out.println(dogBarbos.toString());
        dogBarbos.voice();
        dogBarbos.eat();

        System.out.println(birdKesha.toString());
        birdKesha.fly();
        birdKesha.voice();
    }
}
