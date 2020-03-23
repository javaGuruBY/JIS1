package com.company.service;

import java.util.Objects;

public class Bird {

    protected String color;
    protected int age;
    protected String subspecies;
    protected String breed;
    protected String nickname;

    public Bird(String color, String subspecies, String breed, String nickname, int age) {
        this.color = color;
        this.age = age;
        this.subspecies = subspecies;
        this.breed = breed;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", subspecies='" + subspecies + '\'' +
                ", breed='" + breed + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
