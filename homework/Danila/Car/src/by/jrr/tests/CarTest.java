package by.jrr.tests;

import by.jrr.bean.Car;

public class CarTest {
    Car car;

    public void testShouldWriteSpeedCar() throws Exception {
        car = new Car("Buggati", "Red", 100);

        car.accelerate(50);
        car.decelerate(25);
        car.accelerate(15);

        int actualResult = car.getCurrentSpeed();

        int expectedResult = 25;
        int notExpectedResult = 15;

        checkGoodAnswer(actualResult, expectedResult, "Test 1");
        checkBadAnswer(actualResult, notExpectedResult, "Test 1");
    }

    public void testShouldWritDividing() throws Exception {
        car = new Car("Mercedes", "Blue", 200);

        car.accelerate(15);
        car.decelerate(-1);

        boolean actualResult = car.isDividing();

        boolean expectedResult = false;
        boolean notExpectedResult = true;

        checkGoodAnswerBoolean(actualResult, expectedResult, "Test 2");
        checkBadAnswerBoolean(actualResult, notExpectedResult, "Test 2");
    }

    private void checkGoodAnswer(int actualResult, int expectedResult, String test) throws Exception {
        if(actualResult == expectedResult) {
            System.out.println(test + " has passed!");
        }
        else {
            throw new Exception(test + " hasn't passed!\nExpected result = " + expectedResult + " but actual result = " + actualResult);
        }
    }

    private void checkBadAnswer(int actualResult, int expectedResult, String test) throws Exception {
        if(actualResult != expectedResult) {
            System.out.println(test + " has passed!");
        }
        else {
            throw new Exception(test + " hasn't passed!\nExpected result = " + expectedResult + " but actual result = " + actualResult);
        }
    }

    private void checkGoodAnswerBoolean(boolean actualResult, boolean expectedResult, String test) throws Exception {
        if(actualResult == expectedResult) {
            System.out.println(test + " has passed!");
        }
        else {
            throw new Exception(test + " hasn't passed!\nExpected result = " + expectedResult + " but actual result = " + actualResult);
        }
    }

    private void checkBadAnswerBoolean(boolean actualResult, boolean expectedResult, String test) throws Exception {
        if(actualResult != expectedResult) {
            System.out.println(test + " has passed!");
        }
        else {
            throw new Exception(test + " hasn't passed!\nExpected result = " + expectedResult + " but actual result = " + actualResult);
        }
    }
}

