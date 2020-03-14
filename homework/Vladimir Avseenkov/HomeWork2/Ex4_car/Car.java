package HomeWork2.Ex4_car;

import java.util.Objects;

public class Car {
    String model, color;
    int maxSpeed;
    private int actualSpeed = 0;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    void accelerate(int targetSpeed) {
        for (int i = getActualSpeed(); i < targetSpeed; i++) {
            if (getActualSpeed() >= getMaxSpeed()) {
                break;
            }
            setActualSpeed(getActualSpeed() + 1);
        }
    }

    void decelerate(int targetSpeed) {
        for (int i = getActualSpeed(); i > targetSpeed; i--) {
            if (getActualSpeed() <= 0) {
                break;
            }
            setActualSpeed(getActualSpeed() - 1);
        }

    }

    boolean isDriving() {
        return getActualSpeed() > 0;
    }

    boolean isStopped() {
        return getActualSpeed() == 0;
    }

    boolean canAccelerate() {
        return getActualSpeed() < getMaxSpeed();
    }

    @Override
    public String toString() {
        return "Car " +
                "model " + model +
                ", color " + color +
                ", maxSpeed = " + maxSpeed +
                ", actualSpeed=" + actualSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                actualSpeed == car.actualSpeed &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

}
