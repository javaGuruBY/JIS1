package com.company.service;

public class CreditCard {
    private int cardNumber;
    private int pin;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    public double deposit(int pin, double amount) {
        if (!checkPin(pin)) {
            System.out.println("Неверный пинкод");
            return 0;
        }
        else {
            if (this.loanDebt < 0) {
                if (this.loanDebt > amount) {
                    this.loanDebt = this.loanDebt + amount;
                    System.out.println("Остался задолженность.");
                    return this.balance;
                } else {
                    this.loanDebt = this.loanDebt + amount;
                    this.balance = this.loanDebt;
                    this.loanDebt = 0;
                    System.out.println("Задолженности нет, у вас положительный баланс.");
                    return this.balance;
                }
            } else {
                this.balance = this.balance + amount;
                System.out.println("Успешно зачисленны");
                return this.balance;
            }
        }
    }

    public double withdraw(int pin, double amount){
        if(!checkPin(pin)) {
            System.out.println("неверный пинкод");
            return 0;
        }
        else{
            if((this.balance - amount) < 0)
            {
                if(this.balance - amount * (-1) < this.creditLimit)
                {
                if((this.loanDebt - amount)  > (-1) * this.creditLimit)
                {
                    this.loanDebt = this.balance - amount;
                    this.balance = 0;
                    System.out.println("Кредитная задолженность увеличена. Деньги успешно сняты");
                    return this.loanDebt;
                }}
                else System.out.println("Превышает кредитный лиимит."); return 0;
            }
            else{
                this.balance = this.balance - amount;
                System.out.println("Деньги успешно сняты");
                //успешное снятие
                return this.balance;
            }
        }
    };

    public void getBalance(int pin) {
        if(checkPin(pin)) {
            System.out.println("Ваш баланс: " + this.balance);
        }
        else System.out.println("Неверный пинкод");
    }

    public boolean checkPin(int pin){
        return this.pin == pin;
    }

    public void getLoanDebt(int pin) {
        if(checkPin(pin)) System.out.println("Ваша задолженность: " + this.loanDebt);
        else System.out.println("Неверный пинкод");
    }

    public void changeCreditLimit(double creditLimit){
        this.creditLimit = creditLimit;
        System.out.println("Кредитный лимит успешно изменен");
    }

    public CreditCard(int cardNumber, int pin, double creditLimit){
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.creditLimit = creditLimit;
        System.out.println("Карта успешно создана!");
    };
}
