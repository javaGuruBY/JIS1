package com.vladis1350.bean;

import java.sql.SQLOutput;

public class CreditCard {
    private long numberCard;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    public CreditCard() {
    }

    public CreditCard(long numberCard, int pinCode) {
        this.numberCard = numberCard;
        this.pinCode = pinCode;
        this.balance = 0.0;
        this.loanDebt = 0.0;
    }

    public boolean deposit(int pinCode, double sumDeposit) {
        if (this.pinCode != pinCode) {
            System.out.println("Invalid pin code!");
            return false;
        } else if (this.loanDebt <= sumDeposit) {
            double balanceAmount = sumDeposit - this.loanDebt;
            this.loanDebt = 0;
            this.balance += balanceAmount;
        } else if (this.loanDebt >= sumDeposit) {
            this.loanDebt -= sumDeposit;
        } else {
            this.balance += sumDeposit;
        }
        return true;
    }

    public boolean withdraw(int pinCode, double sumWithdraw) throws Exception {
        if (this.pinCode != pinCode) {
            System.out.println("Invalid pin code!");
            return false;
        } else if (sumWithdraw > this.balance) {
            double residualAmount = sumWithdraw - this.balance;
            creditDeduction(residualAmount);
        } else {
            this.balance -= sumWithdraw;
        }
        return true;
    }

    public void creditDeduction(double sum) throws Exception {
        if (sum <= this.creditLimit && this.loanDebt <= this.creditLimit) {
            this.loanDebt += sum;
            this.balance = 0;
        } else {
            System.out.println("Amount exceeds credit limit!");
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "numberCard=" + numberCard +
                ", pinCode=" + pinCode +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", loanDebt=" + loanDebt +
                '}';
    }

    public long getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(long numberCard) {
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
}
