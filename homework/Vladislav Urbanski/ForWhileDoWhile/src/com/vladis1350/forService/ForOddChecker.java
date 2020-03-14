package com.vladis1350.forService;

public class ForOddChecker implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName() + "\n");
        outputOddNumberThroughFor();
        System.out.println("Thread ended: " + Thread.currentThread().getName() + "\n");
    }

    public void outputOddNumberThroughFor() {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("through for: " + i);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
