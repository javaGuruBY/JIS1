package com.company;
import com.company.bean.CreditCard;

public class Main {

    public static void main(String[] args) {
        CreditCard myCard = new CreditCard(152645, 1234, 1000);
        myCard.deposit(myCard,150, 1234);
        myCard.withdraw(myCard,120, 1234);
        myCard.deposit(myCard,500, 4321);
        myCard.withdraw(myCard,500, 4321);
        myCard.withdraw(myCard,5000, 1234);
        myCard.setCreditLimit(7500);
        myCard.withdraw(myCard,500, 1234);
        myCard.getBalance(myCard,1234);
    }
}
