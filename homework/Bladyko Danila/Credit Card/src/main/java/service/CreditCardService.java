package service;

import bean.CreditCard;

public class CreditCardService {
    public void deposit(CreditCard creditCard, String pinCode, int money) {
        if(isPinCode(creditCard, pinCode)) {
            addMoney(creditCard, money);
        }
    }

    public int withDraw(CreditCard creditCard, String pinCode, int money) {
        if(isPinCode(creditCard, pinCode)) {
            return getMoney(creditCard, money);
        }
        return -1;
    }

    private boolean isPinCode(CreditCard creditCard, String pinCode) {
        return creditCard.pinCodeCard.equals(pinCode);
    }

    private void addMoney(CreditCard creditCard, int money) {
        creditCard.loanDebt -= money;
        if(creditCard.loanDebt < 0) {
            creditCard.balance += ((-1) * creditCard.loanDebt);
            creditCard.loanDebt = 0;
        }
    }

    private int getMoney(CreditCard creditCard, int money) {
        if(creditCard.loanDebt + (creditCard.balance - money) <= creditCard.creditLimit) {
            creditCard.balance -= money;
            if(creditCard.balance < 0) {
                creditCard.loanDebt += ((-1) * creditCard.balance);
                creditCard.balance = 0;
            }

            return money;
        }
        return 0;
    }
}
