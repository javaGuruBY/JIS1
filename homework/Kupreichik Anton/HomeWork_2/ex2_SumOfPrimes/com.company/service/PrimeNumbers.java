package com.company.service;

public class PrimeNumbers {
    private int quantity = 0, sum = 0;

    public void getSum() {
        for (int i = 2; i < 500; ++i) {
            if (quantity < 50) {
                if (i != 17) {
                    if (i != 71) {
                        int count = 0;
                        for (int j = 2; j <= i && count < 2; ++j) {
                            if (i % j == 0) {
                                ++count;
                            }
                        }
                        if (count < 2) {
                            sum += i;
                            quantity++;
                        }
                    }
                }
            } else break;
        }
    }

    @Override
    public String toString() {
        return "PrimeNumbers{" +
                "quantity=" + quantity +
                ", sum=" + sum +
                '}';
    }
}
