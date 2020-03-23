package com.vladis1350.bean;

import java.io.Serializable;
import java.util.Objects;

public class CreditCard implements Serializable {

    private String numberCard;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    public CreditCard() {
    }

    public CreditCard(String numberCard, int pinCode) {
        this.numberCard = numberCard;
        this.pinCode = pinCode;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return pinCode == that.pinCode &&
                Double.compare(that.balance, balance) == 0 &&
                Double.compare(that.creditLimit, creditLimit) == 0 &&
                Double.compare(that.loanDebt, loanDebt) == 0 &&
                Objects.equals(numberCard, that.numberCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberCard, pinCode, balance, creditLimit, loanDebt);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "numberCard='" + numberCard + '\'' +
                ", pinCode=" + pinCode +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", loanDebt=" + loanDebt +
                '}';
    }
}
