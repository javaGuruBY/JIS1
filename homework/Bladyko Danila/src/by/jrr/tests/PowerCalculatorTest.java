package by.jrr.tests;

import by.jrr.bean.PowerCalculator;

public class PowerCalculatorTest {
    PowerCalculator powerCalculator;

    public void test() throws Exception {
        powerCalculator = new PowerCalculator();

        long actualFirstResult = powerCalculator.exponentiation(2, 4);
        long actualSecondResult = powerCalculator.exponentiation(3, 3);
        long actualThirdResult = powerCalculator.exponentiation(1, 10000);

        long expectedFirstResult = 16;
        long expectedSecondResult = 27;
        long expectedThirdResult = 1;

        long notExpectedResult = 4;

        checkGoodAnswer(actualFirstResult, expectedFirstResult, "Test 1");
        checkGoodAnswer(actualSecondResult, expectedSecondResult, "Test 2");
        checkGoodAnswer(actualThirdResult, expectedThirdResult, "Test 3");

        checkBadAnswer(actualFirstResult, notExpectedResult, "Test 1");
        checkBadAnswer(actualSecondResult, notExpectedResult, "Test 2");
        checkBadAnswer(actualThirdResult, notExpectedResult, "Test 3");
    }

    private void checkGoodAnswer(long actualResult, long expectedResult, String test) throws Exception {
        if(actualResult == expectedResult) {
            System.out.println(test + " has passed!");
        }
        else {
            throw new Exception(test + " hasn't passed!\nExpected result = " + expectedResult + " but actual result = " + actualResult);
        }
    }

    private void checkBadAnswer(long actualResult, long expectedResult, String test) throws Exception {
        if(actualResult != expectedResult) {
            System.out.println(test + " has passed!");
        }
        else {
            throw new Exception(test + " hasn't passed!\nExpected result = " + expectedResult + " but actual result = " + actualResult);
        }
    }
}
