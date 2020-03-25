package com.vladis1350.tests;

import com.vladis1350.bean.Car;

public class CarTest {

    public void accelerateShouldIncreaseCurrentSpeed() throws Exception {
        Car car = new Car("Audi", "White", 300);
        car.setCurrentSpeed(120);
        int expectedResult = 135;

        car.accelerate(135);
        int actualResult = car.getCurrentSpeed();

        assertEqualInteger(expectedResult, actualResult, "accelerateShouldIncreaseCurrentSpeed");
    }

    public void decelerateShouldDecreaseCurrentSpeed() throws Exception {
        Car car = new Car("Audi", "White", 300);
        car.setCurrentSpeed(180);
        int expectedResult = 60;

        car.decelerate(60);
        int actualResult = car.getCurrentSpeed();

        assertEqualInteger(expectedResult, actualResult, "decelerateShouldDecreaseCurrentSpeed");
    }

    public void isDrivingShouldReturnTrueIfCurrentSpeedMoreZero() throws Exception {
        Car car = new Car("Audi", "White", 300);
        car.setCurrentSpeed(0);
        boolean expectedResult = false;

        boolean actualResult = car.isDriving();

        assertEqualBoolean(expectedResult, actualResult, "isDrivingShouldReturnTrueIfCurrentSpeedMoreZero");
    }

    private void assertEqualInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }

    private void assertEqualBoolean(boolean expected, boolean actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }

}
