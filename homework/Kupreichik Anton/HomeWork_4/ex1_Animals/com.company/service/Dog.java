package com.company.service;
import java.util.Objects;

public class Dog extends Mammal{

    private String nameOfOwner;

    public Dog(String nameOfOwner, String color, String breed, String nickname, int age) {
        super(color, breed, nickname, age);
        this.nameOfOwner = nameOfOwner;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getAge() {
        return age;
    }



    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getNickname() {
        return nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(nameOfOwner, dog.nameOfOwner);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nameOfOwner='" + nameOfOwner + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
