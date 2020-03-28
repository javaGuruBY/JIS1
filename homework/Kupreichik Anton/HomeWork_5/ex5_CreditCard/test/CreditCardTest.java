package com.company.test;
import com.company.service.CreditCard;

public class CreditCardTest {

    CreditCard creditCard = new CreditCard(4589, 1111, 100);

    public void testShouldWorkWhenPinsIsEquals() throws Exception {
        boolean actualResult = creditCard.checkPin(1111);

        assertEqualsBoolean(actualResult, "testShouldWorkWhenPinsAreEqual");
    }

    public void testShouldWorkWhenYouDontHaveBalanceAndDeposit() throws Exception {
        double actualResult = 40;
        double expectedResult = creditCard.deposit(1111, 40);

        assertEqualsDouble(expectedResult ,actualResult, "testShouldWorkWhenYouHaveLoanDebtAndDeposit");
    }

    public void testShouldWorkWhenYouWidthYouBalance() throws Exception{
        double actualResult = -40;
        double expectedResult = creditCard.withdraw(1111, 40);

        assertEqualsDouble(expectedResult ,actualResult, "testShouldWorkWhenYouHaveLoanDebtAndDeposit");
    }

    private void assertEqualsIntegerAboveZero(int expected, int actual, String description) throws Exception {
        if (expected > actual) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }

    private void assertEqualsIntegerLessThenZero(int expected, int actual, String description) throws Exception {
        if (expected > actual) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }

    private void assertEqualsDouble(double expected, double actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }

    private void assertEqualsInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }


    private void assertEqualsBoolean(boolean actual, String description) throws Exception {
        if (!actual) {
            throw new Exception(description + " has failed! \n"+
                     "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }

    private void assertEqualsString(String expected, String actual, String description) throws Exception {
        if (!expected.equals(actual)) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
