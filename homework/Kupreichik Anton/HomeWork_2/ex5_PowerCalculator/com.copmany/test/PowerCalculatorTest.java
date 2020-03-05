package com.company.test;
import com.company.service.PowerCalculator;

public class PowerCalculateTest {
    PowerCalculator powerCalculator = new PowerCalculator();

    public void test1ShouldWorkWhenMethodWorksCorrectly() throws Exception {
        int expectedResult = powerCalculator.calculateDegree(2,3);
        int actualResult = 8;

        assertEqualsInteger(expectedResult, actualResult, "test1ShouldWorkWhenMethodWorksCorrectly");
    }

    public void test2ShouldWorkWhenMethodWorksCorrectly() throws Exception {
        int expectedResult = powerCalculator.calculateDegree(5,3);
        int actualResult = 125;

        assertEqualsInteger(expectedResult, actualResult, "test2ShouldWorkWhenMethodWorksCorrectly");
    }



    private void assertEqualsInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }

}
