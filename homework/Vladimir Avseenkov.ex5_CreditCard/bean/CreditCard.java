package bean;

import java.io.Serializable;

public class CreditCard implements Serializable {
    private String cardNumber;
    private String cardPinCode;
    private double cardBalance = 0;
    private double loanLimit = 0;
    private double debt = 0;


    public void deposit(double summ, String enteredPinCode) {
        if (isPinCodeCorrect(enteredPinCode) && !isDebtPositive()) {
            cardBalance += summ;
        } else if (isPinCodeCorrect(enteredPinCode) && isDebtPositive()) {
            depositWithDebtBalance(summ);
        } else {
            System.out.println("Operation denied!");
        }
    }

    private void depositWithDebtBalance(double summ) {
        double differenceToDeposit = summ - this.debt;
        this.cardBalance += differenceToDeposit;
        this.debt -= (summ - differenceToDeposit);
    }

    public boolean isDebtPositive() {
        return this.debt > 0;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    private void withdrawWithLoan(double summ) {
        double difference = summ - this.cardBalance;
        this.debt += difference;
        this.cardBalance = this.cardBalance + difference - summ;
    }

    public void withdraw(double summ, String enteredPinCode) {
        double balanceAndLoanLimit = this.cardBalance + this.loanLimit - this.debt;
        if (isPinCodeCorrect(enteredPinCode) && summ <= this.cardBalance) {
            this.cardBalance -= summ;
        } else if (isPinCodeCorrect(enteredPinCode) && balanceAndLoanLimit >= summ) {
            withdrawWithLoan(summ);
        } else {
            System.out.println("Operation denied!");
        }
    }

    public CreditCard(String cardNumber, String cardPinCode) {
        this.cardNumber = cardNumber;
        this.cardPinCode = cardPinCode;

    }


    @Override
    public String toString() {
        return "CreditCard " +
                "card number = " + cardNumber +
                ", cardBalance = " + cardBalance +
                ", loanLimit = " + loanLimit +
                ", debt = " + debt;
    }

    private boolean isPinCodeCorrect(String enteredPinCode) {
        if (!this.cardPinCode.equals(enteredPinCode)) {
            System.out.println("Incorrect PIN-Code");
            return false;
        } else {
            return this.cardPinCode.equals(enteredPinCode);
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    private void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    private String getCardPinCode() {
        return cardPinCode;
    }

    private void setCardPinCode(String cardPinCode) {
        this.cardPinCode = cardPinCode;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    private void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public double getDebt() {
        return debt;
    }

    private void setDebt(double debt) {
        this.debt = debt;
    }
}
