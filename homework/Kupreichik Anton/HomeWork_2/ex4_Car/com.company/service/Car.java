package com.company.service;

import java.util.Objects;
import java.util.Scanner;

public class Car implements Runnable{

    private String model;
    private String color;
    private float topSpeed;
    private float currentSpeed;

    public Car(String model, String color, float topSpeed) {
        this.topSpeed = topSpeed;
        this.color = color;
        this.model = model;
    };

    public void run(){

        this.accelerate(110);
        System.out.println(this.toString());
        this.decelerate(20);
        System.out.println(this.toString());

        System.out.println("this.isDriving() = " + this.isDriving());
        System.out.println("this.isStopped() = " + this.isStopped());
        System.out.println("this.canAccelerate() = " + this.canAccelerate());


    }



    public void accelerate(int targetSpeed){ //ускориться
        while(this.currentSpeed != targetSpeed){
            if (this.currentSpeed == this.topSpeed)
                break;
            else  this.currentSpeed++;
        }
    }

    public void decelerate(int targetSpeed){ //замедлиться
        while(this.currentSpeed != targetSpeed){
            if (this.currentSpeed == 0)  break;
            else  this.currentSpeed--;
        }
    }

    public boolean isDriving() {
        if(this.currentSpeed == 0) return false;
        else return true;
    }

    public boolean isStopped(){
        if(this.currentSpeed == 0) return true;
        else return false;
    }

    public boolean canAccelerate(){
        if(this.currentSpeed < this.topSpeed) return true;
        else return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.topSpeed, topSpeed) == 0 &&
                Float.compare(car.currentSpeed, currentSpeed) == 0 &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, topSpeed, currentSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", topSpeed=" + topSpeed +
                ", currentSpeed=" + currentSpeed +
                '}';
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public float getCurrentSpeed() {
        return currentSpeed;
    }
}
