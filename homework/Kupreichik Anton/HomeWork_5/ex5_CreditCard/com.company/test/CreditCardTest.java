package com.company.test;
import com.company.bean.CreditCard;

import static com.company.service.CreditCardService.*;


public class CreditCardTest {

    CreditCard creditCard = new CreditCard(4589, 1111, 1000);

    public void testShouldWorkWhenPinsIsEquals() throws Exception {
        boolean actualResult = checkPin(creditCard, 1111);

        assertEqualsBoolean(actualResult, "testShouldWorkWhenPinsAreEqual");
    }

    public void testShouldWorkWhenYouDeposit() throws Exception{
        double expected = 500;
        deposit(creditCard, 500, 1111);
        double actualResult = creditCard.getBalance();

        assertEqualsDouble(actualResult, expected, "testShouldWorkWhenYouDeposit");
    }

    public void testShouldWorkWhenYouWithdraw() throws Exception{
        withdraw(creditCard, 600, 1111);
        double actualResult = creditCard.getLoanDebt();

        assertEqualsDouble(actualResult,600 , "testShouldWorkWhenYouWithdraw");
    }

    private void assertEqualsBoolean(boolean actual, String description) throws Exception {
        if (!actual) {
            throw new Exception(description + " has failed! \n"+
                     "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }

    private void assertEqualsDouble(double actual, double expected,String description) throws Exception {
        if (actual != expected) {
            throw new Exception(description + " has failed! \n"+
                    "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
