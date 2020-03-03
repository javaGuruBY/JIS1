package com.company;
import com.company.test.CreditCardTest;

public class CreditCardTestRunner {
    public static void main(String[] args) throws Exception {
        CreditCardTest creditCardTest = new CreditCardTest();

        creditCardTest.testShouldWorkWhenPinsIsEquals();
        creditCardTest.testShouldWorkWhenYouDontHaveBalanceAndDeposit();
        creditCardTest.testShouldWorkWhenYouWidthYouBalance();
    }
}
