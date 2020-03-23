package com.company.service;

import java.util.Objects;

public abstract class Mammal {
    protected String color;
    protected int age;
    protected String breed;
    protected String nickname;

    public Mammal(String color, String breed, String nickname, int age) {
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }



    public String getBreed() {
        return breed;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammal mammal = (Mammal) o;
        return age == mammal.age &&
                Objects.equals(color, mammal.color) &&
                Objects.equals(breed, mammal.breed) &&
                Objects.equals(nickname, mammal.nickname);
    }

}
