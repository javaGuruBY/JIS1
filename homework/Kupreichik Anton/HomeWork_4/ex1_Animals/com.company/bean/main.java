package com.company.bean;
import com.company.service.*;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Chris", "black", "Corgi", "Rek", 2);
        Cat cat = new Cat("Philip", "white", "bengal", "Lop", 3);
        Bird bird = new Bird("red", "wavy", "lori", "Keh", 1);
        Parrot parrot = new Parrot(true, "red", "wavy", "lori", "Keh", 1);

        System.out.println(bird.toString());
        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println(parrot.toString());
        
    }
}
