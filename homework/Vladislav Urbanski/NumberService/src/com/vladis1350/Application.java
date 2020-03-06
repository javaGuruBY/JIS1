package com.vladis1350;

import com.vladis1350.service.NumberService;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        NumberService numberServiceOne = new NumberService(66, 15);
        NumberService numberServiceTwo = new NumberService(15, 2);
        Thread thread = new Thread(numberServiceOne);
        Thread thread1 = new Thread(numberServiceTwo);

        thread.start();
        thread.join();

        thread1.start();
    }
}
