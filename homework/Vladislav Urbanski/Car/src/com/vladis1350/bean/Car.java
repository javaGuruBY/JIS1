package com.vladis1350.bean;

import java.util.Objects;

public class Car implements Runnable {
    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    private int targetSpeed;

    public Car() {
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void run() {
        accelerate(getTargetSpeed());
        setTargetSpeed(90);
        decelerate(getTargetSpeed());
    }

    public int getTargetSpeed() {
        return targetSpeed;
    }

    public void setTargetSpeed(int targetSpeed) {
        this.targetSpeed = targetSpeed;
    }

    public void accelerate(int targetSpeed) {
        for (int i = 0; i <= targetSpeed; i++) {
            if (currentSpeed >= targetSpeed) {
                return;
            } else if (canAccelerate() || isStopped()) {
                currentSpeed++;
                System.out.println(currentSpeed);
                try {
                    Thread.sleep(500 - currentSpeed * 3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void decelerate(int targetSpeed) {
        int decreaseSpeedTo = currentSpeed;
        for (int i = 0; i <= decreaseSpeedTo; i++) {
            if (currentSpeed <= targetSpeed) {
                return;
            } else if (isDriving()) {
                currentSpeed--;
                System.out.println(currentSpeed);
                try {
                    Thread.sleep(500 + currentSpeed * 2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public boolean isDriving() {
        if(currentSpeed > 0) {
            return true;
        }
        return false;
    }

    public boolean isStopped() {
        if (currentSpeed == 0) {
            return true;
        }
        return false;
    }

    public boolean canAccelerate() {
        if (currentSpeed <= maxSpeed) {
            return true;
        }
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.maxSpeed, maxSpeed) == 0 &&
                Double.compare(car.currentSpeed, currentSpeed) == 0 &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, maxSpeed, currentSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
