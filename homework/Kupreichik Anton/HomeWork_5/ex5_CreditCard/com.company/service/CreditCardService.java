package com.company.service;
import com.company.bean.CreditCard;

public class CreditCardService {

    private CreditCardService() {};

    static public void deposit(CreditCard creditCard, double amount, int pin) {
        if (!checkPin(creditCard, pin)) {
            System.out.println("Неверный пинкод");
        } else {
            creditCard.setLoanDebt(-amount);
            if (creditCard.getLoanDebt() < 0) {
                creditCard.setBalance(creditCard.getBalance() + ((-1) * creditCard.getLoanDebt()));
                creditCard.setLoanDebt(0L);
            }
        }
    }

    static public void withdraw(CreditCard creditCard, double amount, int pin) {
        if (!checkPin(creditCard, pin)) {
            System.out.println("Неверный пинкод");
        } else {
            if (creditCard.getLoanDebt() + (creditCard.getBalance() - amount) <= creditCard.getCreditLimit()) {
                creditCard.setBalance(-amount);
                if (creditCard.getBalance() < 0) {
                    creditCard.setLoanDebt(creditCard.getLoanDebt() + ((-1) * creditCard.getBalance()));
                    creditCard.setBalance(0L);
                }
            }
        }
    }

    static public double getBalance(CreditCard creditCard, int pin) {
        if (checkPin(creditCard, pin)) {
            System.out.println("Ваш баланс: " + creditCard.getBalance());
            return creditCard.getBalance();
        } else System.out.println("Неверный пинкод");
        return 0l;
    }

    static public double getLoanDebt(CreditCard creditCard, int pin){
        if (checkPin(creditCard, pin)) {
            System.out.println("Ваша задолженность: " + creditCard.getLoanDebt());
            return creditCard.getBalance();
        } else System.out.println("Неверный пинкод");
        return 0l;
    }

    static public double setCreditLimit(CreditCard creditCard, int pin, double newCreditLimit){
        if (checkPin(creditCard, pin)) {
            creditCard.setCreditLimit(newCreditLimit);
            System.out.println("Ваш новый кредитный лимит: " + creditCard.getCreditLimit());
            return creditCard.getBalance();
        } else System.out.println("Неверный пинкод");
        return 0l;
    }

    static public boolean checkPin(CreditCard creditCard, int pin) {
        return creditCard.getPin() == pin;
    }
}
