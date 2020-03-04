package com.vladis1350;

import com.vladis1350.tests.CreditCardTest;

public class CreditCardRunTest {
    public static void main(String[] args) throws Exception {
        CreditCardTest creditCardTest = new CreditCardTest();

        creditCardTest.withdrawShouldWithdrawMoneyFromAccount();
        creditCardTest.depositShouldMustRepayLoanDebtAndReplenishBalance();
    }
}
