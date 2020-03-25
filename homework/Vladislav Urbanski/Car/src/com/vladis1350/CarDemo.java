package com.vladis1350;

import com.vladis1350.bean.Car;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Audi", "White", 300);
        car.setTargetSpeed(125);
        Thread thread = new Thread(car);

        thread.start();
    }
}
