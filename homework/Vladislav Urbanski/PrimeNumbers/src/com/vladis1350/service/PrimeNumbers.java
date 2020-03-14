package com.vladis1350.service;

public class PrimeNumbers implements Runnable {
    int amountPrimeNumbers = 0;
    int sumPrimeNumbers = 0;

    @Override
    public void run() {
        oddNumberSelection();
        printResult();
    }

    public void oddNumberSelection() {
        for (int i = 1; i <= 500; i++) {
            if (i == 17 || i == 71) {
                continue;
            } else if (isOdd(i) && i != 1) {
                countingNumberOfDivides(i);
            } else if (amountPrimeNumbers == 50) {
                break;
            }
        }
    }

    public boolean isOdd(int index) {
        if (index % 2 != 0 || index == 2) {
            return true;
        }
        return false;
    }

    public void countingNumberOfDivides(int number) {
        int amountDivides = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                amountDivides++;
            }
        }
        checkAmountDividers(number, amountDivides);
    }

    public void checkAmountDividers(int number, int count) {
        if (count <= 2) {
            System.out.print(number + " ");
            sumPrimeNumbers += number;
            amountPrimeNumbers++;
        }
    }

    public void printResult() {
        System.out.println("\nNumber of primes: " + amountPrimeNumbers);
        System.out.println("Sum of primes: " + sumPrimeNumbers);
    }

}
