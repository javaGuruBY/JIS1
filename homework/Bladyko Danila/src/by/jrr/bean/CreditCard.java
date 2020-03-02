package by.jrr.bean;

import java.util.Objects;

public class CreditCard {
    private int numberCard;
    private String pinCodeCard;
    private double balance;
    private int creditLimit;
    private double loanDebt;

    public CreditCard() {
    }

    public CreditCard(int numberCard, String pinCodeCard) {
        this.numberCard = numberCard;
        this.pinCodeCard = pinCodeCard;
    }

    public void deposit(String pinCode, int money) {
        if(isPinCode(pinCode)) {
            addMoney(money);
        }
    }

    public int withDraw(String pinCode, int money) {
        if(isPinCode(pinCode)) {
            return getMoney(money);
        }
        return 0;
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

    public void setBalance(double balance) {
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

    public void setLoanDebt(double loanDebt) {
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
                "NumberCard=" + numberCard +
                ", pinCodeCard='" + pinCodeCard + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", loanDebt=" + loanDebt +
                '}';
    }

    private boolean isPinCode(String pinCode) {
        return this.pinCodeCard.equals(pinCode);
    }

    private void addMoney(int money) {
        this.loanDebt -= money;
        if(this.loanDebt < 0) {
            this.balance += ((-1) * this.loanDebt);
            this.loanDebt = 0;
        }
    }

    private int getMoney(int money) {
        if(this.loanDebt <= this.creditLimit) {
            if(this.balance < money) {
                this.loanDebt += (money - this.balance);
                this.balance = 0;
                return money;
            }
            else {
                this.balance -= money;
                return money;
            }
        }
        return 0;
    }
}
