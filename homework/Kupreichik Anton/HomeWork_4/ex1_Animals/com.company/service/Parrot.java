package com.company.service;


public class Parrot extends Bird{
    private boolean tailPresence;

    public Parrot(boolean tailPresence, String color, String subspecies, String breed, String nickname, int age){
        super(color, subspecies, breed, nickname, age);
        this.tailPresence = tailPresence;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "tailPresence=" + tailPresence +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", subspecies='" + subspecies + '\'' +
                ", breed='" + breed + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
