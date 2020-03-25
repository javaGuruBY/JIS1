package bean;

import java.io.Serializable;
import java.util.Objects;

public class CreditCard implements Serializable {
    public int numberCard;
    public String pinCodeCard;
    public float balance;
    public int creditLimit;
    public float loanDebt;

    public CreditCard() {
    }

    public CreditCard(int numberCard, String pinCodeCard) {
        this.numberCard = numberCard;
        this.pinCodeCard = pinCodeCard;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        numberCard = numberCard;
    }

    public String getPinCodeCard() {
        return pinCodeCard;
    }

    public void setPinCodeCard(String pinCodeCard) {
        this.pinCodeCard = pinCodeCard;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getLoanDebt() {
        return loanDebt;
    }

    public void setLoanDebt(float loanDebt) {
        this.loanDebt = loanDebt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return numberCard == that.numberCard &&
                Double.compare(that.balance, balance) == 0 &&
                creditLimit == that.creditLimit &&
                Double.compare(that.loanDebt, loanDebt) == 0 &&
                Objects.equals(pinCodeCard, that.pinCodeCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberCard, pinCodeCard, balance, creditLimit, loanDebt);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "numberCard=" + numberCard +
                ", pinCodeCard='" + pinCodeCard + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", loanDebt=" + loanDebt +
                '}';
    }
}
