package com.vladis1350;

import com.vladis1350.bean.CreditCard;

public class Application {

    public static void main(String[] args) throws Exception {
        CreditCard myCard = new CreditCard(1234567890121234L, 6666);
        myCard.setCreditLimit(500);

        myCard.deposit(6666, 150);
        myCard.withdraw(6666, 50);

        myCard.deposit(4321, 500);

        myCard.withdraw(4321, 500);

        myCard.withdraw(6666, 5000);

        myCard.setCreditLimit(7500);
        myCard.withdraw(6666, 5000);
        System.out.println(myCard.toString());

        myCard.deposit(6666, 3500);
        System.out.println(myCard.toString());
        myCard.deposit(6666, 3500);
        System.out.println(myCard.toString());
    }
}
