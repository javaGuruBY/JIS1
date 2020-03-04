package com.vladis1350.tests;

import com.vladis1350.bean.CreditCard;

public class CreditCardTest {

    public void withdrawShouldWithdrawMoneyFromAccount() throws Exception {
        CreditCard creditCard = new CreditCard(1234567890123456L, 1234);
        creditCard.setBalance(280);
        creditCard.setCreditLimit(170);
        boolean expected = true;

        boolean actual = creditCard.withdraw(1234, 1000);
        assertEqualBoolean(expected, actual, "withdrawShouldWithdrawMoneyFromAccount");
    }

    public void depositShouldMustRepayLoanDebtAndReplenishBalance() throws Exception {
        CreditCard creditCard = new CreditCard(1234567890123456L, 1234);
        creditCard.setBalance(0);
        creditCard.setCreditLimit(170);
        creditCard.setLoanDebt(155);
        creditCard.deposit(1234, 160);
        boolean expected = true;

        boolean actual = creditCard.deposit(1234, 160);
        assertEqualBoolean(expected, actual, "depositShouldMustRepayLoanDebtAndReplenishBalance");
    }

    private void assertEqualDouble(double expected, double actual, String description) throws Exception {
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
