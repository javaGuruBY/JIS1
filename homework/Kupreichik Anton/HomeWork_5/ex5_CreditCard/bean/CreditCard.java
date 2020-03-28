package com.company.bean;

import com.company.service.CreditCardService;

import java.io.Serializable;
import java.util.Objects;

public class CreditCard implements Serializable {
    private int cardNumber;
    private int pin;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getLoanDebt() {
        return loanDebt;
    }

    public void setLoanDebt(double loanDebt) {
        this.loanDebt = loanDebt;
    }

    public CreditCard() {
    }

    public CreditCard(int cardNumber, int pin, double creditLimit){
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.creditLimit = creditLimit;
        System.out.println("Карта успешно создана!");
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return cardNumber == that.cardNumber &&
                pin == that.pin &&
                Double.compare(that.balance, balance) == 0 &&
                Double.compare(that.creditLimit, creditLimit) == 0 &&
                Double.compare(that.loanDebt, loanDebt) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, pin, balance, creditLimit, loanDebt);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", pin=" + pin +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", loanDebt=" + loanDebt +
                '}';
    }
}
