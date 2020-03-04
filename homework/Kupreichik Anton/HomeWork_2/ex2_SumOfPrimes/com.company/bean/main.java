package com.company.bean;

import com.company.service.PrimeNumbers;

public class Main {

    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.getSum();
        System.out.println(primeNumbers.toString());
    }
}
