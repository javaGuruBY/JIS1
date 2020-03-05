package com.company.test;
import com.company.service.Car;

public class CarTest {
    Car car = new Car("Tesla Model S", "Black", 290);

    public void testShouldWorkWhenAccelerate() throws Exception {
        car.accelerate(100);
        int expectedResult = (int) car.getCurrentSpeed();
        int actualResult = 100;

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenAccelerate");
    }

    public void testShouldWorkWhenDecelerate() throws Exception {
        car.accelerate(100);
        car.decelerate(50);
        int expectedResult = (int) car.getCurrentSpeed();
        int actualResult = 50;

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenDecelerate");
    }

    public void testShouldWorkWhenCarIsDriving() throws Exception {
        car.accelerate(100);
        boolean expectedResult = car.isDriving();
        boolean actualResult = true;

        assertEqualsBoolean(expectedResult, actualResult, "testShouldWorkWhenCarIsDriving");
    }

    public void testShouldWorkWhenCarIsStopped() throws Exception {
        car.decelerate(0);
        boolean expectedResult = car.isStopped();
        boolean actualResult = true;

        assertEqualsBoolean(expectedResult, actualResult, "testShouldWorkWhenCarIsStopped");
    }

    public void testShouldWorkWhenCarIsCanAccelerate() throws Exception {
        car.accelerate(100);
        boolean expectedResult = car.canAccelerate();
        boolean actualResult = true;

        assertEqualsBoolean(expectedResult, actualResult, "testShouldWorkWhenCarIsCanAccelerate");
    }







    private void assertEqualsInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }

    private void assertEqualsBoolean(boolean expected, boolean actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }

}
