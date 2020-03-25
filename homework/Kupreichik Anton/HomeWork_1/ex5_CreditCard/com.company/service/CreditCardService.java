package com.company.service;


import com.company.bean.CreditCard;

public class CreditCardService {


    public void deposit(CreditCard creditCard, double amount, int pin) {
        if (!checkPin(creditCard, pin)) {
            System.out.println("Неверный пинкод");
        } else {
            if (ifYouHaveALoanDebt(creditCard)) {
                if (ifYouHaveMoney(creditCard, amount)) creditCard.setBalance(creditCard.getBalance() - amount);
            }
            else{
                if(ifYouLoanDebtMoreThenMoney(creditCard, amount)){
                    creditCard.setLoanDebt(creditCard.getLoanDebt() + amount);
            }
            else{
                creditCard.setBalance(creditCard.getBalance() - amount);
            }
            }
        }
    }


    public void withdraw(CreditCard creditCard, double amount, int pin) {
        if (!checkPin(creditCard, pin)) {
            System.out.println("Неверный пинкод");
        } else {
            if (ifAmountMoreThenBalanceAndCreditLimit(creditCard, amount)) {
                if (ifYouHaveMoney(creditCard, amount)) {
                    creditCard.setBalance(creditCard.getBalance() + amount);
                    System.out.println("успешно!");
                }
                if (isMoneyLessCreditLimit(creditCard, amount)) {
                    creditCard.setBalance(creditCard.getBalance() + amount);
                } else {
                    creditCard.setLoanDebt(-amount);
                }
            }
        }
    }

    public void getBalance(CreditCard creditCard, int pin) {
        if (checkPin(creditCard, pin)) {
            System.out.println("Ваш баланс: " + creditCard.getBalance());
        } else System.out.println("Неверный пинкод");
    }

    public boolean checkPin(CreditCard creditCard, int pin) {
        return creditCard.getPin() == pin;
    }

    public void getLoanDebt(CreditCard creditCard, int pin) {
        if (checkPin(creditCard, pin)) System.out.println("Ваша задолженность: " + creditCard.getLoanDebt());
        else System.out.println("Неверный пинкод");
    }

    public void changeCreditLimit(CreditCard creditCard, double creditLimit) {
        creditCard.setCreditLimit(creditLimit);
        System.out.println("Кредитный лимит успешно изменен");
    }

    public boolean isMoneyLessCreditLimit(CreditCard creditCard, double amount) {
        if (amount > creditCard.getCreditLimit()) return false;
        else return true;
    }

    public boolean ifYouHaveMoney(CreditCard creditCard, double amount) {
        if (creditCard.getBalance() - amount > 0) return true;
        else return false;
    }

    public boolean ifAmountMoreThenBalanceAndCreditLimit(CreditCard creditCard, double amount) {
        if ((creditCard.getBalance() + creditCard.getCreditLimit()) < amount) return false;
        else return true;
    }

    public boolean ifYouHaveALoanDebt(CreditCard creditCard) {
        if (creditCard.getLoanDebt() >= 0) return true;
        else return false;
    }

    public boolean ifYouLoanDebtMoreThenMoney(CreditCard creditCard, double amount){
        if(creditCard.getLoanDebt() + amount < 0) return true;
        return false;
    }

}
