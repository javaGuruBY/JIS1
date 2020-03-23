package com.vladis1350.service;

import com.vladis1350.bean.CreditCard;
import com.vladis1350.exception.WrongPasswordException;
import com.vladis1350.interfaces.CreditCardOperations;

public class CreditCardService implements CreditCardOperations {

    private CreditCard creditCard;

    public CreditCardService(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void deposit(int pinCode, double depositMoney) throws WrongPasswordException {
        if (isPinCode(pinCode)) {
            putMoneyOnTheCard(depositMoney);
        }
    }

    private void putMoneyOnTheCard(double depositMoney) {
        if (creditCard.getLoanDebt() >= depositMoney) {
            creditCard.setLoanDebt(creditCard.getLoanDebt() - depositMoney);
        } else {
            double debtBalance = depositMoney - creditCard.getLoanDebt();
            creditCard.setLoanDebt(0);
            creditCard.setBalance(debtBalance);
        }
    }

    @Override
    public void withdraw(int pinCode, double money) throws WrongPasswordException {
        if(isPinCode(pinCode)){
            withdrawingMoneyFromCard(money);
        }
    }

    private void withdrawingMoneyFromCard(double desiredAmount) {
        if (desiredAmount > availableAmount()) {
            System.out.println("Amount exceeds credit limit.");
        } else if (desiredAmount <= creditCard.getBalance()) {
            creditCard.setBalance(creditCard.getBalance() - desiredAmount);
        } else {
            double balance = desiredAmount - creditCard.getBalance();
            creditCard.setLoanDebt(creditCard.getLoanDebt() + balance);
            creditCard.setBalance(0);
        }
    }

    public double availableAmount() {
        double expectedDebt = creditCard.getBalance() + creditCard.getCreditLimit();
        return expectedDebt - creditCard.getLoanDebt();
    }

    private boolean isPinCode(int pin) throws WrongPasswordException {
        if (creditCard.getPinCode() != pin) {
            throw new WrongPasswordException("Wrong password!");
        }
        return true;
    }

}
