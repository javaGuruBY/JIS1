package com.company.bean;

import com.company.service.Car;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите модель");
        String model = in.nextLine();
        System.out.println("Введите цвет");
        String color = in.nextLine();
        System.out.println("Введите максимальную скорость");
        float topSpeed = in.nextFloat();

        Thread thread = new Thread(new Car(model,color,topSpeed));
        thread.start();
    }
}
