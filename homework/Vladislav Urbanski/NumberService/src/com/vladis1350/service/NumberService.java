package com.vladis1350.service;

public class NumberService implements Runnable {
    int startInterval;
    int finishInterval;
    int summaryNumbers = 0;
    int summaryEvenNumbers = 0;

    public NumberService() {
    }

    public NumberService(int startInterval, int finishInterval) {
        this.startInterval = startInterval;
        this.finishInterval = finishInterval;
    }

    public void rangeSum(int start, int finish) {
        if (start <= finish) {
            startMoreFinish();
        } else {
            finishMoreStart();
        }
        System.out.println("\nThe sum of all numbers = " + summaryNumbers);
        System.out.println("Sum of positive numbers = " + summaryEvenNumbers);
    }

    public void startMoreFinish() {
        for (int i = getStartInterval(); i <= getFinishInterval(); i++) {
            System.out.print(i + " ");
            setSummaryNumbers(getSummaryNumbers() + i);
            if (evenNumber(i)) {
                setSummaryEvenNumbers(getSummaryEvenNumbers() + i);
            }
        }
    }

    public void finishMoreStart() {
        for (int j = getFinishInterval(); j <= getStartInterval(); j++) {
            System.out.print(j + " ");
            setSummaryNumbers(getSummaryNumbers() + j);
            if (evenNumber(j)) {
                setSummaryEvenNumbers(getSummaryEvenNumbers() + j);
            }
        }
    }

    public boolean evenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void run() {
        rangeSum(getStartInterval(), getFinishInterval());
    }

    public int getSummaryNumbers() {
        return summaryNumbers;
    }

    public void setSummaryNumbers(int summaryNumbers) {
        this.summaryNumbers = summaryNumbers;
    }

    public int getSummaryEvenNumbers() {
        return summaryEvenNumbers;
    }

    public void setSummaryEvenNumbers(int summaryEvenNumbers) {
        this.summaryEvenNumbers = summaryEvenNumbers;
    }

    public int getStartInterval() {
        return startInterval;
    }

    public int getFinishInterval() {
        return finishInterval;
    }
}
