package com.vladis1350.tests;

import com.vladis1350.Counter.Counter;

public class CounterTest {

    public void incrementShouldIncreaseValueByGivenStep() throws Exception {
        Counter counter = new Counter();

        int expected = 6;
        counter.setValue(5);
        counter.setStep(1);
        counter.increment();
        int actual = counter.getValue();
        assertEqualInteger(expected, actual, "incrementShouldIncreaseValueByGiveStep");
    }

    public void decrementShouldDecreaseValueByGivenStep() throws Exception {
        Counter counter = new Counter();

        int expected = 55;
        counter.setValue(60);
        counter.setStep(5);
        counter.decrement();
        int actual = counter.getValue();
        assertEqualInteger(expected, actual, "decrementShouldDecreaseValueByGivenStep");
    }

    public void setNotShouldAcceptValueSmaller0AndMore100() throws Exception {
        Counter counter = new Counter();

        int expectedZero = 0;
        int expectedOneHundred = 100;

        counter.setValue(101);
        int actualZero = counter.getValue();

        counter.setValue(100);
        int actualOneHundred = counter.getValue();

        assertEqualInteger(expectedZero, actualZero, "setNotShouldAcceptValueSmallerZero");
        assertEqualInteger(expectedOneHundred, actualOneHundred, "setNotShouldAcceptValueMore100");
    }

    public void resetShouldResetValueToInitial() throws Exception {
        Counter counter = new Counter();

        int expectedValue = 0;
        int expectedStep = 1;
        counter.setValue(98);
        counter.setStep(2);
        counter.reset();
        int actualValue = counter.getValue();
        int actualStep = counter.getStep();

        assertEqualInteger(expectedValue, actualValue, "Reset value test");
        assertEqualInteger(expectedStep, actualStep, "Reset step test");
    }

    private void assertEqualInteger(int expected, int actual, String description) throws Exception {
        if(expected != actual) {
            throw new Exception(description + " has failed! \n" +
                    " Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
