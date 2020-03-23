package com.vladis1350;

import com.vladis1350.bean.CreditCard;
import com.vladis1350.exception.WrongPasswordException;
import com.vladis1350.service.CreditCardService;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CreditCardTest
{

    @Test
    public void testShouldWithdrawMoneyWithBalance() throws Exception {
        CreditCard card = new CreditCard("4255 1111 2222 3333", 1111);
        CreditCardService service = new CreditCardService(card);

        card.setBalance(200);
        double expectedBalance = 50;

        service.withdraw(1111, 150.00);
        double actualBalance = card.getBalance();
        assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void testShouldWithdrawMoneyWithBalanceAndAddLoanDept() throws Exception {
        CreditCard card = new CreditCard("4255 1111 2222 3333", 1111);
        CreditCardService service = new CreditCardService(card);

        card.setBalance(200);
        card.setLoanDebt(0);
        card.setCreditLimit(500);
        double expectedBalance = 0;
        double expectedLoanDept = 400;

        service.withdraw(1111, 600);
        double actualBalance = card.getBalance();
        double actualLoanDept = card.getLoanDebt();
        assertEquals(expectedBalance, actualBalance);
        assertEquals(expectedLoanDept, actualLoanDept);
    }

    @Test
    public void testShouldNotWithdrawMoneyBecauseLimitIsExceeded() throws WrongPasswordException {
        CreditCard card = new CreditCard("4255 1111 2222 3333", 1111);
        CreditCardService service = new CreditCardService(card);

        card.setBalance(1000);
        card.setLoanDebt(0);
        card.setCreditLimit(1000);

        double expectedBalance = 1000;
        double expectedLoanDept = 0;

        service.withdraw(1111, 2100);

        double actualBalance = card.getBalance();
        double actualLoanDept = card.getLoanDebt();
        assertEquals(expectedBalance, actualBalance);
        assertEquals(expectedLoanDept, actualLoanDept);
    }

    @Test(expected = WrongPasswordException.class)
    public void testShouldReturnWrongPasswordException() throws Exception {
        CreditCard card = new CreditCard("4255 1111 2222 3333", 1111);
        CreditCardService service = new CreditCardService(card);

        service.withdraw(1122, 500);
    }

    @Test
    public void testShouldDepositMoneyOnBalance() throws Exception {
        CreditCard card = new CreditCard("4255 1111 2222 3333", 1111);
        CreditCardService service = new CreditCardService(card);

        card.setBalance(0);
        card.setLoanDebt(0);
        double expectedBalance = 50;
        double expectedLoanDept = 0;

        service.deposit(1111, 50);
        double actualBalance = card.getBalance();
        double actualLoanDept = card.getLoanDebt();
        assertEquals(expectedBalance, actualBalance);
        assertEquals(expectedLoanDept, actualLoanDept);
    }

    @Test
    public void testShouldDepositMoneyOnLoanDept() throws Exception {
        CreditCard card = new CreditCard("4255 1111 2222 3333", 1111);
        CreditCardService service = new CreditCardService(card);

        card.setBalance(0);
        card.setLoanDebt(300);
        double expectedBalance = 0;
        double expectedLoanDept = 150;

        service.deposit(1111, 150);
        double actualBalance = card.getBalance();
        double actualLoanDept = card.getLoanDebt();
        assertEquals(expectedBalance, actualBalance);
        assertEquals(expectedLoanDept, actualLoanDept);
    }

    @Test
    public void testShouldRepayLoanDeptAndAndAddMoneyOnBalance() throws Exception {
        CreditCard card = new CreditCard("4255 1111 2222 3333", 1111);
        CreditCardService service = new CreditCardService(card);

        card.setBalance(0);
        card.setLoanDebt(300);
        double expectedBalance = 50;
        double expectedLoanDept = 0;

        service.deposit(1111, 350);
        double actualBalance = card.getBalance();
        double actualLoanDept = card.getLoanDebt();
        assertEquals(expectedBalance, actualBalance);
        assertEquals(expectedLoanDept, actualLoanDept);
    }
}
