package by.jrr.bean;

import java.util.Objects;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    public Car() {
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void accelerate(int targetSpeed) {
        if(targetSpeed <= this.currentSpeed) {
            return;
        }
        int speedDifference = targetSpeed - this.currentSpeed;

        for(int i = 0; i < speedDifference; i++) {
            if(currentSpeed == maxSpeed) {
                break;
            }
            this.currentSpeed++;
        }
    }

    public void decelerate(int targetSpeed) {
        if(this.currentSpeed <= targetSpeed) {
            return;
        }
        int speedDifference = this.currentSpeed - targetSpeed;

        for(int i = 0; i < speedDifference; i++) {
            if(this.currentSpeed == 0) {
                break;
            }
            this.currentSpeed--;
        }
    }

    public boolean isDividing() {
        if(this.currentSpeed > 0) {
            return true;
        }
        return false;
    }

    public boolean isStopped() {
        if(this.currentSpeed == 0) {
            return true;
        }
        return false;
    }

    public boolean canAccelerate() {
        if(this.currentSpeed < this.maxSpeed) {
            return true;
        }
        return false;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                currentSpeed == car.currentSpeed &&
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
}
