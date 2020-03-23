package com.company.service;

import java.util.Objects;

public class Cat extends Mammal{
    private String nameOfOwner;

    public Cat(String nameOfOwner, String color, String breed, String nickname, int age) {
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
    public String toString() {
        return "Cat{" +
                "nameOfOwner='" + nameOfOwner + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(nameOfOwner, cat.nameOfOwner);
    }


}
