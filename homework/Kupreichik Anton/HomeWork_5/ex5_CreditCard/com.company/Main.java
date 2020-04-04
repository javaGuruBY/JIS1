package com.company;
import com.company.bean.CreditCard;

import static com.company.service.CreditCardService.*;

public class Main {

    public static void main(String[] args) {
        CreditCard myCard = new CreditCard(152645, 1234, 1000);
        deposit(myCard,150, 1234);
        withdraw(myCard,120, 1234);
        deposit(myCard,500, 4321);
        withdraw(myCard,500, 4321);
        withdraw(myCard,500, 1234);
        setCreditLimit(myCard, 1234, 7500);
        withdraw(myCard,500, 1234);
        getBalance(myCard,1234);
        getLoanDebt(myCard,1234);
    }

}
