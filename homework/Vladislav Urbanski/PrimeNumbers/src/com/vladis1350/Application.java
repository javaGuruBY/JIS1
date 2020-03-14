package com.vladis1350;

import com.vladis1350.service.PrimeNumbers;

public class Application {
    public static void main(String[] args) {
        Thread thread = new Thread(new PrimeNumbers());
        thread.start();
    }
}
