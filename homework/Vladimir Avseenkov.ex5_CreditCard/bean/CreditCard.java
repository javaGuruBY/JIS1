package bean;

public class CreditCard {
    private String cardNumber;
    private String cardPinCode;
    private double cardBalance = 0;
    private double loanLimit = 0;
    private double debt = 0;


    public void deposit(double summ, String enteredPinCode) {
        if (this.cardPinCode.equals(enteredPinCode) && !checkDebt()) {
            cardBalance += summ;
        } else if (this.cardPinCode.equals(enteredPinCode) && checkDebt()) {
            depositWithDebt(summ);
        } else {
            System.out.println("Operation denied!");
        }
    }

    private void depositWithDebt(double summ) {
        double differenceToDeposit = summ - this.debt;
        this.cardBalance += differenceToDeposit;
        this.debt -= (summ - differenceToDeposit);
    }

    public boolean checkDebt () {
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
        this.cardBalance = this.cardBalance + difference - summ; //should equals Zero
    }

    public void withdraw(double summ, String enteredPinCode) {
        double balanceAndLoanLimit = this.cardBalance + this.loanLimit - this.debt;
        if (this.cardPinCode.equals(enteredPinCode) && summ <= this.cardBalance) {
            this.cardBalance -= summ;
        } else if (this.cardPinCode.equals(enteredPinCode) && balanceAndLoanLimit >= summ) {
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
}
