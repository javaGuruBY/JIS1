package com.vladis1350.tests;

import com.vladis1350.service.PowerCalculator;

public class PowerCalculateTest {

    public void exponentiationShouldRaisePowerToPower() throws Exception {
        PowerCalculator calculator = new PowerCalculator();

        int expectedResultOne = 256;
        int expectedResultRwo = 1728;

        int actualOne = calculator.exponentiation(4,4);
        int actualTwo = calculator.exponentiation(12,3);

        assertEqualInteger(expectedResultOne, actualOne, "exponentiationShouldRaisePowerToPower 4 to the power of 4");
        assertEqualInteger(expectedResultRwo, actualTwo, "exponentiationShouldRaisePowerToPower 12 to the power of 3");
    }

    private void assertEqualInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
