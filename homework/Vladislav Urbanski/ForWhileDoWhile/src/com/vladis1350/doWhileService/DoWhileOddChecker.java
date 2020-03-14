package com.vladis1350.doWhileService;

public class DoWhileOddChecker implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName() + "\n");
        outputOddNumbersThoughDoWhile();
        System.out.println("Thread ended: " + Thread.currentThread().getName() + "\n");
    }

    public void outputOddNumbersThoughDoWhile() {
        int index = 0;
        do {
            if (index % 2 == 0) {
                System.out.println("through do while: " + index);
            }
            index++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (index <= 50);
    }
}
