package com.company.bean;
import com.company.service.CreditCard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Создайте номер карты");
        int cardNumber, pin;
        double creditLimit, amount;
        cardNumber = in.nextInt();
        System.out.println("Создайте пинкод");
        pin = in.nextInt();
        System.out.println("Укажите кредитный лимит");
        creditLimit = in.nextDouble();
        CreditCard creditCard = new CreditCard(cardNumber, pin, creditLimit);
        int choose = 0;
        while(choose != -1){
            System.out.println("1.Зачисление средств\n2.Снятие средств\n3.Изменить кредитный лимит\n4.Узнать баланс\n5.Выход");
            choose = in.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Введите пинкод");
                    pin = in.nextInt();
                    System.out.println("Введите сумму");
                    amount = in.nextInt();
                    creditCard.deposit(pin, amount);
                    break;
                case 2:
                    System.out.println("Введите пинкод");
                    pin = in.nextInt();
                    System.out.println("Введите сумму");
                    amount = in.nextInt();
                    creditCard.withdraw(pin, amount);
                    break;
                case 3:
                    System.out.println("Введите новый кредитный лимит");
                    creditLimit = in.nextDouble();
                    creditCard.changeCreditLimit(creditLimit);
                    break;
                case 4:
                    System.out.println("Введите пинкод");
                    pin = in.nextInt();
                    creditCard.getBalance(pin);
                    creditCard.getLoanDebt(pin);
                    break;
                case 5:
                    choose = -1;
                    break;
            }
        }
    }
}
